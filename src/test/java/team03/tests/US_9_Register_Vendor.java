package team03.tests;

import org.testng.annotations.Test;
import team03.pages.HomePage;
import team03.pages.VendorRegistrationPage;
import team03.utilities.ConfigReader;
import team03.utilities.Driver;

public class US_9_Register_Vendor {
    HomePage homePage=new HomePage();
    VendorRegistrationPage vendorRegistrationPage= new VendorRegistrationPage();
    @Test
    public void test(){
        //1-Navigate to https://allovercommerce.com/

        Driver.getDriver().get(ConfigReader.getProperty("all_over_commerce_url"));

        //2-User Clicks "Register" button
        homePage.linkRegister.click();

        //3-User Clicks “Become a Vendor” link
        homePage.becomeVendorButton.click();

        //4-User types a e-mail
        vendorRegistrationPage.vendorEmail.sendKeys(ConfigReader.getProperty("email"));

        //5-User Clicks “RE-SEND CODE” BUTTON
        vendorRegistrationPage.reSendCodeButton.click();



    }

}
