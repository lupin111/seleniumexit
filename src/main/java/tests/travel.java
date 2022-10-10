package tests;

import BasePages.xpathPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class travel extends BasePages.basePage {
    public  static Logger logger = Logger.getLogger(travel.class);
    @Test
    public void travelpage(){
        test.log(LogStatus.INFO,"Test Passed");

        logger.info("Closing Login Popup");
        //        closing the login pop up
        driver.findElement(xpathPage.closeButton).click();
//        clicking on travel button
        logger.info("going to travel page");
        driver.findElement(xpathPage.travel).click();
    }
}
