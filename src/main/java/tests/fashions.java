package tests;

import BasePages.xpathPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class fashions extends BasePages.basePage {
    public  static Logger logger = Logger.getLogger(fashions.class);
    @Test
    public void fashion() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Closing Login Popup");
        //        closing the login pop up
        driver.findElement(xpathPage.closeButton).click();
        Thread.sleep(2000);
//        clicking on fashion button
        logger.info("Fashion button clicked");
        driver.findElement(xpathPage.fashion).click();
    }
}
