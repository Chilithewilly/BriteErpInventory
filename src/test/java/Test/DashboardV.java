package Test;

import Pages.HomePage;
import Pages.InventoryPage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DashboardV extends TestBase {

    @Test(groups = "smoke")
    public void DeliveryOrdersMyCompany() throws InterruptedException{

        InventoryPage inventoryPage= new InventoryPage();
        driver.get(ConfigurationReader.getProperty("url"));
        HomePage.log();
        Thread.sleep(5000);
        inventoryPage.DeliveryOrders.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"YourCompany: Delivery Orders - Odoo");

    }

    @Test(groups = "smoke")
    public void Manufacturing() throws InterruptedException{
        InventoryPage inventoryPage= new InventoryPage();
        driver.get(ConfigurationReader.getProperty("url"));
        HomePage.log();
        Thread.sleep(5000);
        inventoryPage.ManufacturingPage.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"YourCompany: Manufacturing - Odoo");

    }

}
