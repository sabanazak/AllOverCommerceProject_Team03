package team03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team03.utilities.Driver;

public class MyAccountPage {

    public MyAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Addresses']")
    public WebElement linkAddresses;

    @FindBy(xpath = "//a[@href='https://allovercommerce.com/my-account-2/edit-address/billing/']")
    public WebElement linkAddBillingAddresses;

    @FindBy(xpath = "//a[@href='https://allovercommerce.com/my-account-2/edit-address/shipping/']")
    public WebElement linkAddShippingAddresses;

    @FindBy(xpath = "//a[@href='https://allovercommerce.com/my-account-2/edit-account/']")
    public WebElement linkAccountDetails;


}
