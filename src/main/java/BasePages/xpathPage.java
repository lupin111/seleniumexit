package BasePages;

import org.openqa.selenium.By;

public class xpathPage {
    public static By closeButton = By.xpath("//button[contains(text(),'✕')]");
    public static By firstItem = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[3]/div[1]/div[1]");
    public static By removeButtons = By.xpath("//div[contains(text(),'Remove')]");
    public static By Offer = By.xpath("//div[contains(text(),'Top Offers')]");
    public static By grocery = By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/img[1]");

    public static By travel = By.xpath("//div[contains(text(),'Travel')]");
    public static By Plus = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]");
    public static By Seller = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]/span[1]");
    public static By carousel = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[3]/*[1]");
    public static By removeConfirm = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]");
    public static By fashion = By.xpath("//div[contains(text(),'Fashion')]");

}
