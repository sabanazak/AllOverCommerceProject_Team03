package team03.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import team03.pages.HomePage;
import team03.pages.VendorRegistrationPage;
import team03.utilities.ConfigReader;
import team03.utilities.Driver;
import team03.utilities.ReusableMethods;

public class US_10password {

HomePage homePage=new HomePage();
VendorRegistrationPage vendorRegistrationPage=new VendorRegistrationPage();

    @Test
    public void password(){
        //1-Navigate to https://allovercommerce.com/
        Driver.getDriver().get(ConfigReader.getProperty("all_over_commerce_url"));



        //2- Click "Register" button
        homePage.linkRegister.click();

        //3-Click “Become a Vendor” link
        homePage.becomeVendorButton.click();

        //4-Send valid e-mail
        vendorRegistrationPage.vendorEmail.sendKeys(ConfigReader.getProperty("vendor_email"));


        //5-Click “RE-SEND CODE” BUTTON

        //6- Send valid verification code
        vendorRegistrationPage.verificationCode.sendKeys("1111");
        //7-Send "short" password
        vendorRegistrationPage.vendorPassword.sendKeys("1");
        ReusableMethods.verifyElementDisplayed(vendorRegistrationPage.shortpassword);


        ReusableMethods.waitFor(3);
        //8-Send "weak" password
        vendorRegistrationPage.vendorPassword.sendKeys("123456");
        ReusableMethods.verifyElementDisplayed(vendorRegistrationPage.weakpassword);

        ReusableMethods.waitFor(3);

        //9-Send "good" password
        vendorRegistrationPage.vendorPassword.sendKeys("1234567A");
        ReusableMethods.verifyElementDisplayed(vendorRegistrationPage.goodpassword);
        ReusableMethods.waitFor(3);
        //10-Send "strong" password
        vendorRegistrationPage.vendorPassword.sendKeys("1234567Ab");
        ReusableMethods.verifyElementDisplayed(vendorRegistrationPage.strongpassword);
        ReusableMethods.waitFor(3);
        //11-Send confirm Password
vendorRegistrationPage.confirmPassword.sendKeys("1234567Ab");
    }
}
