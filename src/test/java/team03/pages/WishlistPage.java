package team03.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team03.utilities.Driver;

public class WishlistPage {
    public WishlistPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='woocommerce-Button button'")
    public WebElement btnGoShop;

    @FindBy(xpath = "//td[.='No products added to the wishlist']")
    public WebElement msgNoProduct;


//*[@id="yith-wcwl-form"]/table/tbody/tr[3]/td/a


}
