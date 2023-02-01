package team03.tests.emel;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import team03.pages.*;
import team03.utilities.ConfigReader;
import team03.utilities.Driver;
import team03.utilities.ReusableMethods;

public class US_12VendorBillingAddressDataProvider {

    //@DataProvider
   // public Object [][] vendorAddressData(){
        //Object[][] vendorBillingAddress = {
               // {"Emel", "Metin","Button Wood Street","main","Pickerington", "OH 43147","6475743327"}

       // };
       // return vendorBillingAddress;
    //}


    @Test
   // public void vendorBillingAddressDataTest(String firstname, String lastname,String street, String apt, String town, String ZIP, String phone){
            public void vendorBillingAddressDataTest(){


        Driver.getDriver().get(ConfigReader.getProperty("all_over_commerce_url"));

        HomePage homePage = new HomePage();
        MyAccountPage myAccountPage = new MyAccountPage();
        BillingAddressPage billingAddressPage = new BillingAddressPage();




       homePage.vendorSignIn.click();
       homePage.inputSigninUsername.sendKeys("bulentarslan0710@gmail.com");
       homePage.inputSiginPassword.sendKeys("Emel2911");
       //homePage.chkRememberMe.click();
       homePage.btnSignIn.click();
       homePage.btnSignOut.click();


       myAccountPage.linkAddresses.click();
       myAccountPage.linkAddBillingAddresses.click();
       //myAccountPage.linkAccountDetails.click();


       billingAddressPage.inputBillingFirstName.sendKeys("Emel");
       billingAddressPage.inputBillingLastName.sendKeys("Arslan");
       billingAddressPage.inputBillingCompany.sendKeys("SwordLion");
       billingAddressPage.clickCountryArrow.click();
       billingAddressPage.sendCountryName.sendKeys("Canada");
       billingAddressPage.sendCountryName.sendKeys(Keys.ENTER);
       billingAddressPage.inputBillingAddress1.sendKeys("287 ");
       billingAddressPage.inputBillingAddress2.sendKeys("GlenForest");
       billingAddressPage.inputBillingCity.sendKeys("Toronto");
       ReusableMethods.waitFor(3);

       billingAddressPage.clickStateArrow.click();
       ReusableMethods.waitFor(3);
      // billingAddressPage.sendStateName.click();
       billingAddressPage.sendStateName.sendKeys("Ontario");
       ReusableMethods.waitFor(3);
       billingAddressPage.sendStateName.sendKeys(Keys.ENTER);
       ReusableMethods.waitFor(3);
       billingAddressPage.inputBillingZipCode.sendKeys("M4N 2A5");
       billingAddressPage.inputBillingPhone.sendKeys("6475743327");
       //billingAddressPage.inputBillingEmail.sendKeys();




       //boolean isDisplayed = vendorBillingAddressPage.autoVenBilAddressEMail.isDisplayed();
       //Assert.assertTrue(isDisplayed);
       // ReusableMethods.verifyElementDisplayed(vendorBillingAddressPage.autoVenBilAddressEMail);

       //billingAddressPage.btnBillingSaveAddress.click();




    }


}
