package Pages;

import Utilites.ConfigurationReader;
import Utilites.Driver;
import Utilites.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends TestBase {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[10]/a/b")
    public WebElement SignIn;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/a[2]")
    public WebElement DatabaseDropDown;

    @FindBy(xpath = "(//a[@href='/web?db=BriteErpDemo'])")
    public  WebElement Demo;

    @FindBy(xpath = "(//input[@name='login'])")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])")
    public WebElement SignInButton;

    @FindBy(xpath = "(//li[@style='display: block;'])[6]")
    public WebElement InventoryPage;


    public static void log(){
        HomePage homePage =new HomePage();
        driver.get(ConfigurationReader.getProperty("url"));
        homePage.DatabaseDropDown.click();
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        homePage.InventoryPage.click();
    }

}
