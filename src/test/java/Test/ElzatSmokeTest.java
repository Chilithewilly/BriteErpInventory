package Test;

import Pages.HomePage;
import Pages.InventoryPage;
import Pages.ProductMovePage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class ElzatSmokeTest extends TestBase {

    @Test(groups = "smoke")
    public void ProductMovePageTest() throws InterruptedException{
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();

        extentLogger = report.createTest("Verify Product Move Page");
        driver.get(ConfigurationReader.getProperty("url"));
        extentLogger.info("Verifying the Database selection page");
        Assert.assertEquals(driver.getTitle(), "Odoo");
        extentLogger.info("Clicking the correct Database option");
        homePage.DatabaseDropDown.click();
        extentLogger.info("Verifying the Login Page");
        Assert.assertEquals(driver.getTitle(),"Login | Website localhost");
        extentLogger.info("Sending valid Username to Username field");
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        extentLogger.info("Sending valid Password to Password field");
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        extentLogger.info("Clicking sign in button");
        homePage.SignInButton.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the Home Page");
        Assert.assertEquals(driver.getTitle(), "#Inbox - Odoo");
        extentLogger.info("Clicking Inventory Tab");
        homePage.InventoryPage.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the Inventory Page");
        Assert.assertEquals(driver.getTitle(),"Inventory - Odoo");
        extentLogger.info("Clicking Product Move Option");
        inventoryPage.productMove.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the Product Move Page");
        Assert.assertEquals(driver.getTitle(), "Product Moves - Odoo");


    }

    @Test(groups = "smoke")
    public void SunnySunPageTest() throws InterruptedException{
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();

        extentLogger = report.createTest("Verify SunnySun Page");
        driver.get(ConfigurationReader.getProperty("url"));
        extentLogger.info("Verifying the Database selection page");
        Assert.assertEquals(driver.getTitle(), "Odoo");
        extentLogger.info("Clicking the correct Database option");
        homePage.DatabaseDropDown.click();
        extentLogger.info("Verifying the Login Page");
        Assert.assertEquals(driver.getTitle(),"Login | Website localhost");
        extentLogger.info("Sending valid Username to Username field");
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        extentLogger.info("Sending valid Password to Password field");
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        extentLogger.info("Clicking sign in button");
        homePage.SignInButton.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the Home Page");
        Assert.assertEquals(driver.getTitle(), "#Inbox - Odoo");
        extentLogger.info("Clicking Inventory Tab");
        homePage.InventoryPage.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the Inventory Page");
        Assert.assertEquals(driver.getTitle(),"Inventory - Odoo");
        extentLogger.info("Clicking Sunny Sun Option");
        inventoryPage.sunnySun.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the SunnySun Page");
        Assert.assertTrue(driver.getTitle().contains("YourCompany: SunnySun"));
    }

    @Test(groups = "smoke")
    public void SunnySunAdvanceSearchTest() throws InterruptedException{
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();
        ProductMovePage productMovePage = new ProductMovePage();

        extentLogger = report.createTest("Verify SunnySun Advanced Search options is displayed");
        driver.get(ConfigurationReader.getProperty("url"));
        extentLogger.info("Verifying the Database selection page");
        Assert.assertEquals(driver.getTitle(), "Odoo");
        extentLogger.info("Clicking the correct Database option");
        homePage.DatabaseDropDown.click();
        extentLogger.info("Verifying the Login Page");
        Assert.assertEquals(driver.getTitle(),"Login | Website localhost");
        extentLogger.info("Sending valid Username to Username field");
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        extentLogger.info("Sending valid Password to Password field");
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        extentLogger.info("Clicking sign in button");
        homePage.SignInButton.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the Home Page");
        Assert.assertEquals(driver.getTitle(), "#Inbox - Odoo");
        extentLogger.info("Clicking Inventory Tab");
        homePage.InventoryPage.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the Inventory Page");
        Assert.assertEquals(driver.getTitle(),"Inventory - Odoo");
        extentLogger.info("Clicking Sunny Sun Option");
        inventoryPage.sunnySun.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the SunnySun Page");
        Assert.assertEquals(driver.getTitle(), "YourCompany: SunnySun - Odoo");
        productMovePage.advancedSearchButton.click();
        extentLogger.info("Verify that the Advanced Search option is displayed");
        Assert.assertTrue(productMovePage.advancedSearchOptions.isDisplayed());

    }
}
