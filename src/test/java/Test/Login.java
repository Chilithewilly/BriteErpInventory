package Test;

import Pages.HomePage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @Test
    public void signInTest(){
        HomePage homePage =new HomePage();
        driver.get(ConfigurationReader.getProperty("url"));
        homePage.DatabaseDropDown.click();
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        homePage.InventoryPage.click();

    }
}
