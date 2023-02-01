package team03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team03.utilities.Driver;

public class VendorHomePage {

    public VendorHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement vendorSignIn;

    @FindBy(xpath =  "//input[@id='username']")
    public WebElement vendorSignInUserName;

    @FindBy(xpath =  "//input[@id='password']")
    public WebElement vendorSignInPassword;

    @FindBy(xpath ="//button[@value='Sign In']")
    public WebElement vendorSignInButton;

    @FindBy(xpath = "//a[@class='login logout inline-type']")
    public WebElement clickVendorSignOutButton;



}
