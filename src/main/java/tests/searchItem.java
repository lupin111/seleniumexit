package tests;

import BasePages.xpathPage;
import BasePages.searchPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class searchItem extends BasePages.basePage{

    public  static Logger logger = Logger.getLogger(searchItem.class);

    @Test
    public void search(){
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Closing Login Popup");
        //        closing the login pop up
        driver.findElement(xpathPage.closeButton).click();
//    searching the item
    logger.info("Searching the item");
    driver.findElement(searchPage.searchBar).sendKeys(ReadingPropertiesFile.getProperty("searchItem"));
    driver.findElement(searchPage.searchButton).click();
    }
}
