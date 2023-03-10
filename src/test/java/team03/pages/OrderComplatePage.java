package team03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team03.utilities.Driver;

import java.util.List;

public class OrderComplatePage {

    public OrderComplatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='Thank you. Your order has been received.']")
    public WebElement orderComplateMessage;

}
