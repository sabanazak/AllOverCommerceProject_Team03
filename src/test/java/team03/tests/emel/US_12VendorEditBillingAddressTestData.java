package team03.tests.emel;

import org.testng.annotations.Test;
import team03.pages.VendorBillingAddressPage;
import team03.pages.VendorHomePage;
import team03.pages.VendorMyAccountAddressPage;
import team03.utilities.ConfigReader;
import team03.utilities.Driver;

public class US_12VendorEditBillingAddressTestData {
    @Test
    public void editVendorBillingAddressTest(){
        VendorHomePage vendorHomePage = new VendorHomePage();
        VendorMyAccountAddressPage vendorMyAccountAddressPage = new VendorMyAccountAddressPage();
        VendorBillingAddressPage vendorBillingAddressPage = new VendorBillingAddressPage();
        Driver.getDriver().get(ConfigReader.getProperty("https://allovercommerce.com/"));

        vendorHomePage.vendorSignIn.click();
        vendorHomePage.vendorSignInUserName.sendKeys("team03.vendor1");
        vendorHomePage.vendorSignInPassword.sendKeys("TechProEd");
        vendorHomePage.vendorSignInButton.click();

        vendorMyAccountAddressPage.clickVendorAddress.click();
        vendorMyAccountAddressPage.vendorEditBillingAddress.click();

    }



}
