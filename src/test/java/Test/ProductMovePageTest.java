package Test;

import Pages.HomePage;
import Pages.InventoryPage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductMovePageTest extends TestBase {

    @Test
    public void ProductMovePageTest() throws InterruptedException{
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();

        driver.get(ConfigurationReader.getProperty("url"));
        homePage.DatabaseDropDown.click();
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        homePage.InventoryPage.click();
        inventoryPage.productMove.click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getTitle().contains("Product Moves"));


    }
}
