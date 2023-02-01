package team03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team03.utilities.Driver;

public class VendorBillingAddressPage {
    public VendorBillingAddressPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "billing_first_name")
        public WebElement inputVenBilAddressFirstName;
    @FindBy(id = "billing_last_name")
        public WebElement inputVenBilAddressLastName;
    @FindBy(id = "select2-billing_country-container")
       public WebElement selectVenBilAddressCountry;
    @FindBy(id= "billing_address_1_field")
       public WebElement inputVenBilAddressStreet;
    @FindBy(id = "billing_address_2_field")
       public WebElement  inputVenBilAddressApt;
    @FindBy(xpath = "//p[@id ='billing_city_field']")
       public WebElement inputVenBilAddressTown;
    @FindBy(xpath = "//input[@class='select2-search__field']")
       public WebElement selectVenBilAddressState;
    @FindBy(xpath = "//input[@id='billing_postcode']")
       public WebElement inputVenBilAddressZIP;
    @FindBy(xpath = "//input[@type='tel']")
       public WebElement inputVenBilAddressPho;
    @FindBy(xpath = "//input[@id='billing_email']")
       public WebElement autoVenBilAddressEMail;
    @FindBy(xpath = "//button[@name='save_address']")
        public WebElement clickVebBilAddressSave;




}
