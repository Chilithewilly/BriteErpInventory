package Pages;

import Utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

public class ConfigurationPage {
    public ConfigurationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[contains(text(),'Configuration')]")
    public WebElement configurationButton;

    @FindBy(xpath = "//span[contains(text(),'Warehouse Management')]")
    public WebElement warehousesManagement;

    @FindBy(xpath = "(//span[contains(text(),'Products')])[2]")
    public WebElement products;

    @FindBy(xpath = "//span[contains(text(),'Warehouses')]")
    public WebElement warehouses;

    @FindBy(xpath = "//span[contains(text(),'Operations Types')]")
    public WebElement operationTypes;

//    public static boolean isClickable(WebElement e) {
//        try {
//
//            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
//            wait.until(ExpectedConditions.elementToBeClickable(e));
//            return true;
//        } catch (Exception ex) {
//            return false;
//        }
//
//    }
}