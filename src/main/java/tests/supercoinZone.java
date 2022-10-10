package tests;
import BasePages.LoginPage;
import BasePages.xpathPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class supercoinZone extends BasePages.basePage {
    public  static Logger logger = Logger.getLogger(supercoinZone.class);
    @Test
    public void supercoin() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Login using credentials");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(3000);
        logger.info("Hover over my account button");
        //        hover over my account button
        WebElement accMenu = driver.findElement(By.xpath("//div[contains(text(),'My Account')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accMenu).build().perform();
        Thread.sleep(3000);
//        click on Supercoin zone sub menu button
        logger.info("Opening Super Coin zone");
        WebElement supercoin = driver.findElement(By.xpath("//div[contains(text(),'SuperCoin Zone')]"));
        actions.moveToElement(supercoin).click().build().perform();
    }
}