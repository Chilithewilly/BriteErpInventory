package Test;
import Pages.HomePage;
import Pages.InventoryPage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.testng.Assert;

import org.testng.annotations.Test;
public class SunnySunPageTest extends TestBase {

    @Test
    public void SunnySunPageTest(){
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();

        driver.get(ConfigurationReader.getProperty("url"));
        homePage.DatabaseDropDown.click();
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        homePage.InventoryPage.click();
        inventoryPage.sunnySun.click();
    }
}
