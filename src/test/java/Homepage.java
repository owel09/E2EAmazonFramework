import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

/*
 *Created by Work on 25/9/2021 4:23 PM
 */
public class Homepage extends Base{

    WebDriver driver; //for parellel execution kaya declared global ito

    @BeforeTest
    public void openURL() throws IOException {

        driver = initialiazeDriver(); //pwede mo tawagin yung driver pero ano yung url?
        driver.get(properties.getProperty("homepageAmazonURL"));



    }
}
