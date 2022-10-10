package tests;
import BasePages.LoginPage;
import BasePages.xpathPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class downloadApp extends BasePages.basePage {
    public  static Logger logger = Logger.getLogger(downloadApp.class);
    @Test
    public void downlaod() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Closing the Login Popup");
        //        closing the login pop up
        driver.findElement(xpathPage.closeButton).click();
        Thread.sleep(3000);
//        hover over more button
        logger.info("Clicking more button");
        WebElement more = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(more).build().perform();
        Thread.sleep(3000);
//        clicking the download button
        logger.info("Download App button clicked");
        WebElement downApp = driver.findElement(By.xpath("//div[contains(text(),'Download App')]"));
        actions.moveToElement(downApp).click().build().perform();
        Thread.sleep(2000);
        String title = driver.getTitle();
        String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        Assert.assertEquals(expectedTitle,title);
    }
}