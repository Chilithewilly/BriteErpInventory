package Test;

import Pages.HomePage;
import Pages.InventoryPage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.testng.annotations.Test;



public class DashboardV extends TestBase {

    @Test
    public void DeliveryOrdersMyCompany() {
        HomePage homePage =new HomePage();
        InventoryPage inventoryPage= new InventoryPage();
        driver.get(ConfigurationReader.getProperty("url"));
        homePage.DatabaseDropDown.click();
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        homePage.InventoryPage.click();
        inventoryPage.Dashborad.click();
        inventoryPage.DeliveryOrders.click();

    }

    @Test
    public void Manufacturing(){
        HomePage homePage =new HomePage();
        InventoryPage inventoryPage= new InventoryPage();
        driver.get(ConfigurationReader.getProperty("url"));
        homePage.DatabaseDropDown.click();
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        homePage.InventoryPage.click();
        inventoryPage.Dashborad.click();
        inventoryPage.ManufacturingPage.click();

    }

}
