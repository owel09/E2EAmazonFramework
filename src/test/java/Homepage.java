import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

/*
 *Created by Work on 25/9/2021 4:23 PM
 */
public class Homepage extends Base{

    WebDriver driver; //for parellel execution kaya declared global ito

    private static final Logger logger= LogManager.getLogger(Homepage.class.getName());

    @BeforeTest
    public void openURL() throws IOException {

        driver = initialiazeDriver(); //pwede mo tawagin yung driver pero ano yung url?
        logger.info("Driver is initialized");
        driver.get(properties.getProperty("homepageAmazonURL"));
        logger.info("Navigated to Homepage");

    }

    @Test
    public void signIn(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.getCart().click();



    }

    @AfterTest
    public void teardown(){
        driver.close();
    }



}
