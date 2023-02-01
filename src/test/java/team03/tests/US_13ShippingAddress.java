package team03.tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import team03.pages.HomePage;
import team03.pages.MyAccountPage;
import team03.pages.ShippingAddressPage;
import team03.pages.VendorRegistrationPage;
import team03.utilities.ConfigReader;
import team03.utilities.Driver;
import team03.utilities.JSUtils;
import team03.utilities.ReusableMethods;

public class US_13ShippingAddress extends JSUtils {
HomePage homePage=new HomePage();
ShippingAddressPage shippingAddressPage=new ShippingAddressPage();
    WebDriver driver;


    MyAccountPage myAccountPage= new MyAccountPage();
    // Actions actions = new Actions(driver);
    @Test
    public void shippingAddress(){

        //1-Navigate to https://allovercommerce.com/
        Driver.getDriver().get(ConfigReader.getProperty("all_over_commerce_url"));



        //sign-in as a vendor
        Driver.getDriver().get(ConfigReader.getProperty("all_over_commerce_url"));
        homePage.linkSignIn.click();
        homePage.inputSigninUsername.sendKeys(ConfigReader.getProperty("vendor_email"));
        ReusableMethods.waitFor(2);
        homePage.inputSiginPassword.sendKeys(ConfigReader.getProperty("vendor_password"));
        homePage.btnSignIn.click();

       ////go to my account page-go to sign-out

        homePage.btnSignOut.click();


        //3-Click "Address" button
myAccountPage.linkAddresses.click();



        //4.Click "ADD" button under shipping address
      myAccountPage.linkAddShippingAddresses.click();

        //5.Send "firstname" , "lastname" ,"Country/Region,
        shippingAddressPage.inputShippingFirstName.sendKeys("Emel");
        shippingAddressPage.inputShippingLastName.sendKeys("Sahin");
        shippingAddressPage.inputShippingCompany.sendKeys("TechPro");
        //shippingAddressPage.selectShippingCountry.click();
        shippingAddressPage.countrySelect1.click();
        shippingAddressPage.countrySelect.sendKeys("Albania");
        shippingAddressPage.countrySelect.sendKeys(Keys.ENTER);

      ReusableMethods.waitFor(3);
        shippingAddressPage.inputShippingAddress1.click();

      shippingAddressPage.inputShippingAddress1.sendKeys("1189 Drainer Avenue");

    //  ReusableMethods.waitFor(3);
       shippingAddressPage.inputShippingCity.click();
       shippingAddressPage.inputShippingCity.sendKeys("Panama City");


        //street address, "Town / City ", "State", "ZIP Code".

      //  shippingAddressPage.shippingCounty.click();
      // ReusableMethods.waitFor(3);
     //   shippingAddressPage.shippingCounty.sendKeys(Keys.ENTER);
      // shippingAddressPage.shippingCounty.sendKeys("Fier");

        //6.Click "SAVE ADDRESS" button



    }
}
