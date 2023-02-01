package team03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team03.utilities.Driver;

import javax.security.auth.x500.X500Principal;

public class BillingAddressPage {

    public BillingAddressPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "billing_first_name")
    public WebElement inputBillingFirstName;

    @FindBy(id = "billing_last_name")
    public WebElement inputBillingLastName;

    @FindBy(id = "billing_company")
    public WebElement inputBillingCompany;

    @FindBy(id = "billing_country")
    public WebElement selectBillingCountry;

    @FindBy(id = "billing_address_1")
    public WebElement inputBillingAddress1;

    @FindBy(id = "billing_address_2")
    public WebElement inputBillingAddress2;

    @FindBy(id = "billing_city")
    public WebElement inputBillingCity;

    @FindBy(id = "billing_state")
    public WebElement selectBillingState;

    @FindBy(id = "billing_postcode")
    public WebElement inputBillingZipCode;

    @FindBy(id = "billing_phone")
    public WebElement inputBillingPhone;

    @FindBy(id = "billing_email")
    public WebElement inputBillingEmail;

    @FindBy(xpath = "//button[.='Save address']")
    public WebElement btnBillingSaveAddress;
    //////////////////////////////

    @FindBy(id = "select2-billing_country-container")
    public WebElement clickCountryArrow;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement sendCountryName;


    @FindBy(xpath= "//span[@class='select2-selection__placeholder']")
    public WebElement clickStateArrow;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement sendStateName;

}
