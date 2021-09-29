import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 *Created by Work on 29/9/2021 6:06 PM
 */
public class LandingPage {

    WebDriver driver;

    //paano magcreate ng constructor? bakit?

    public LandingPage(WebDriver driver){
        this.driver=driver;

    }

    private By signIn = By.cssSelector("span[id='nav-link-accountList-nav-line-1']");

    public WebElement getsignIn(){
        return driver.findElement(signIn);
    }


}
