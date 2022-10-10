package tests;

import BasePages.xpathPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class topOffers extends BasePages.basePage {
    public  static Logger logger = Logger.getLogger(topOffers.class);
    @Test
    public void offers() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Closing Login Popup");
        //        closing the login pop up
        driver.findElement(xpathPage.closeButton).click();//        clicking top offers button
        logger.info("navigating to top offers");
        driver.findElement(xpathPage.Offer).click();
        Thread.sleep(2000);
    }
}
