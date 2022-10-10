package tests;
//import Pages.DownloadAppPage;
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

public class wishlist extends BasePages.basePage {
    public  static Logger logger = Logger.getLogger(wishlist.class);
    @Test
    public void download() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");

        logger.info("Login using credentials");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(3000);
        //        hover over my account button
        logger.info("Hovering over my account page");
        WebElement accMenu = driver.findElement(By.xpath("//div[contains(text(),'My Account')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accMenu).build().perform();
        Thread.sleep(3000);
//        clicking wishlist submenu button
        logger.info("Going to wishlist page");
        WebElement wishlistBtn = driver.findElement(By.xpath("//div[contains(text(),'Wishlist')]"));
        actions.moveToElement(wishlistBtn).click().build().perform();
        Thread.sleep(2000);
        String title = driver.getTitle();
        String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        Assert.assertEquals(expectedTitle,title);
    }
}