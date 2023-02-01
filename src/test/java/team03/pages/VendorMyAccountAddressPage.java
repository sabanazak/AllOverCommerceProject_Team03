package team03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team03.utilities.Driver;

public class VendorMyAccountAddressPage {
    public VendorMyAccountAddressPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//a[@class = 'edit btn btn-link btn-primary btn-underline mb-4']")
        public WebElement clickVendorBillingAddressAdd;
    @FindBy(xpath = "//*[. ='Edit Your Billing Address']")
    public WebElement vendorEditBillingAddress;
    @FindBy(className = "woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address is-active" )
    public WebElement clickVendorAddress;
}
