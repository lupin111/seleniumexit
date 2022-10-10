package tests;
import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class orders extends BasePages.basePage {
    public  static Logger logger = Logger.getLogger(orders.class);
    @Test
    public void orders() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");

        logger.info("Login using credentials");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(3000);
        //        hover over my account button
        logger.info("Hovering over my account");
        WebElement accMenu = driver.findElement(By.xpath("//div[contains(text(),'My Account')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accMenu).build().perform();
        Thread.sleep(3000);
//        clicking on orders sub menu button
        logger.info("Going to orders page");
        WebElement orders = driver.findElement(By.xpath("//div[contains(text(),'Orders')]"));
        actions.moveToElement(orders).click().build().perform();
    }
}