package Test;

import Pages.HomePage;
import Pages.InventoryPage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZibaSmokeTest extends TestBase {

    @Test
    public void ReceiptsPageTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();

        driver.get(ConfigurationReader.getProperty("url"));
        Assert.assertEquals(driver.getTitle(), "Odoo");
        homePage.DatabaseDropDown.click();
        Assert.assertEquals(driver.getTitle(), "Login | Website localhost");
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "#Inbox - Odoo");
        homePage.InventoryPage.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Inventory - Odoo");
        inventoryPage.Receipts.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "My Company, Chicago: Receipts - Odoo");
    }


    @Test
    public void AdvancedSearchTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();

        driver.get(ConfigurationReader.getProperty("url"));
        Assert.assertEquals(driver.getTitle(), "Odoo");
        homePage.DatabaseDropDown.click();
        Assert.assertEquals(driver.getTitle(), "Login | Website localhost");
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "#Inbox - Odoo");
        homePage.InventoryPage.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Inventory - Odoo");
        inventoryPage.advancedSearchButton.click();
        Thread.sleep(5000);
        Assert.assertTrue(inventoryPage.advancedSearchOptions.isDisplayed());


    }
}