package tests;
import BasePages.xpathPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class becomeSeller extends BasePages.basePage {
    public  static Logger logger = Logger.getLogger(becomeSeller.class);
    @Test
    public void groceriespage() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Closing login Popup");
//        closing the login pop up
        driver.findElement(xpathPage.closeButton).click();
//        click on becomeseller button
        logger.info("Opening Becomeseller page");
        driver.findElement(xpathPage.Seller).click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        String expectedTitle = "Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce";
        Assert.assertEquals(expectedTitle,title);
    }
}
