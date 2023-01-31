package team03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team03.utilities.Driver;

public class SeydaHomePage {

    public SeydaHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "username")
    public WebElement inputSigninUsername;
    @FindBy(id = "password")
    public WebElement inputSiginPassword;
    @FindBy(id = "rememberme")
    public WebElement chkRememberMe;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement btnSignIn;
    //*[@id="signin"]/form/p[3]
    //*[@id="signin"]/form/p[contains(@class,'submit-status')]
    @FindBy(xpath = " //*[@id=\"signin\"]/form/p[contains(@class,'submit-status')]")
    public WebElement msgSignInErrorMessage;
}
