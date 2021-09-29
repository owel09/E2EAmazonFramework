import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/*
 *Created by Work on 25/9/2021 3:43 PM
 */
public class Base {

    public WebDriver driver;
    public Properties properties;

    public WebDriver initialiazeDriver() throws IOException {

        properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties");
        properties.load(fileInputStream);

        String browsername = properties.getProperty("browser");

        switch (browsername) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "InternetExporer":
                driver = new InternetExplorerDriver();
                break;
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return driver;
    }
}
