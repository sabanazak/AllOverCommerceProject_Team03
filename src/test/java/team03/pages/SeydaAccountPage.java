package team03.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team03.utilities.Driver;
import team03.utilities.JSUtils;

public class SeydaAccountPage {

    public SeydaAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement linkSignIn1;

    @FindBy(xpath = "//a[@name='account_first_name']")
    public WebElement enterfirstname;



}