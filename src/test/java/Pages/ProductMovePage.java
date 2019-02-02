package Pages;

import Utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMovePage {
    public ProductMovePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='o_searchview_more fa fa-search-plus'])")
    public WebElement advancedSearchButton;

    @FindBy(xpath = "(//div[@class='btn-group o_search_options'])")
    public WebElement advancedSearchOptions;
}
