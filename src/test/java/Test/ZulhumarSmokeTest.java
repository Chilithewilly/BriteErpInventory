package Test;

import Pages.ConfigurationPage;
import Pages.HomePage;
import Pages.InventoryPage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZulhumarSmokeTest extends TestBase {


    @Test
    public void  ConfigurationTest(){

            HomePage homePage = new HomePage();
            driver.get(ConfigurationReader.getProperty("url"));
            homePage.DatabaseDropDown.click();
            homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
            homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
            homePage.SignInButton.click();
            homePage.InventoryPage.click();


             ConfigurationPage configurationPage = new ConfigurationPage();
        softAssert.assertTrue(configurationPage.configurationButton.isDisplayed());


        String beforeClick = driver.getTitle();
        configurationPage.warehousesManagement.click();
        String afterClick = driver.getTitle();

        softAssert.assertEquals(beforeClick,afterClick);

        configurationPage.products.click();
        String afterclick2= driver.getTitle();

        softAssert.assertEquals(beforeClick,afterclick2);

        }

     @Test
    public void WarehousesTest() throws InterruptedException {
         HomePage homePage = new HomePage();
         driver.get(ConfigurationReader.getProperty("url"));
         homePage.DatabaseDropDown.click();
         homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
         homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
         homePage.SignInButton.click();
         homePage.InventoryPage.click();

         ConfigurationPage configurationPage = new ConfigurationPage();
         configurationPage.warehousesManagement.click();

         softAssert.assertTrue(configurationPage.warehouses.isDisplayed());
         Thread.sleep(10000);
         softAssert.assertTrue(configurationPage.operationTypes.isDisplayed());

         String beforeClick = driver.getTitle();
         configurationPage.warehouses.click();
         String afterClick = driver.getTitle();

         softAssert.assertEquals(beforeClick, afterClick);

         configurationPage.operationTypes.click();
         String afterclick2 = driver.getTitle();

         softAssert.assertEquals(beforeClick, afterclick2);

     }
    }

