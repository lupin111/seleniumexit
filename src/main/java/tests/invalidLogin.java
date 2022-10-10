package tests;

import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class invalidLogin extends BasePages.basePage {
    public  static Logger logger = Logger.getLogger(invalidLogin.class);

    @Test
    public void signIn() {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Login using Invalid Credentials");
//        login using invalid credentials
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("wrong_password"));
        driver.findElement(LoginPage.continue_btn).click();

    }
}
