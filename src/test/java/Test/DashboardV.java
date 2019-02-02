package Test;

import Pages.HomePage;
import Pages.InventoryPage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DashboardV extends TestBase {

    @Test
    public void DeliveryOrdersMyCompany() throws InterruptedException{

        InventoryPage inventoryPage= new InventoryPage();
        driver.get(ConfigurationReader.getProperty("url"));
        HomePage.log();
        inventoryPage.DeliveryOrders.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"YourCompany: Delivery Orders - Odoo");

    }

    @Test
    public void Manufacturing() throws InterruptedException{
        InventoryPage inventoryPage= new InventoryPage();
        driver.get(ConfigurationReader.getProperty("url"));
        HomePage.log();
        inventoryPage.ManufacturingPage.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"YourCompany: Manufacturing - Odoo");

    }

}
