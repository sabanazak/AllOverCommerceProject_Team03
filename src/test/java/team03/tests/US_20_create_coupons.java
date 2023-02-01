package team03.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team03.pages.HomePage;
import team03.pages.MyAccountAsAVendorPage;
import team03.pages.MyAccountPage;
import team03.pages.StoreManagerPage;
import team03.utilities.ConfigReader;
import team03.utilities.Driver;
import team03.utilities.JSUtils;
import team03.utilities.ReusableMethods;

public class US_20_create_coupons extends JSUtils {

    WebDriver driver;
    HomePage homePage =new HomePage();
    MyAccountAsAVendorPage myAccountAsAVendorPage=new MyAccountAsAVendorPage();
    StoreManagerPage storeManagerPage=new StoreManagerPage();
    MyAccountPage myAccountPage= new MyAccountPage();
   // Actions actions = new Actions(driver);



    @Test
    public void test(){
        //sign-in as a vendor
        Driver.getDriver().get(ConfigReader.getProperty("all_over_commerce_url"));
        homePage.linkSignIn.click();
        homePage.inputSigninUsername.sendKeys(ConfigReader.getProperty("vendor_user_name"));
        ReusableMethods.waitFor(2);
        homePage.inputSiginPassword.sendKeys(ConfigReader.getProperty("vendor_password"));
        homePage.btnSignIn.click();

        //go to my account page
        homePage.btnSignOut.click();

        //go to store manager page
        myAccountPage.btnStoreManager.click();

        ReusableMethods.waitFor(3);
        //got to coupons page
        clickElementByJS(storeManagerPage.btnCoupons);

        clickElementByJS(storeManagerPage.btnAddNew);

        //user types input boxes
        storeManagerPage.codeInput.sendKeys("55555");
        storeManagerPage.descriptionInput.sendKeys("new coupon 1");

        Select select=new Select(storeManagerPage.discount_typeInput);
        select.selectByIndex(0);

        storeManagerPage.coupon_amountInput.clear();
        storeManagerPage.coupon_amountInput.sendKeys("30");

        storeManagerPage.expiry_dateInput.sendKeys("2024-01-01");

        ReusableMethods.selectCheckBox(storeManagerPage.free_shippingInput,false);

        ReusableMethods.selectCheckBox(storeManagerPage.show_on_storeInput,false);

        //storeManagerPage.btnSubmit.click();
        clickElementByJS(storeManagerPage.btnSubmit);
        //----------------------------------------------------------------------------coupon created
        //go to home page
        Driver.getDriver().get(ConfigReader.getProperty("all_over_commerce_url"));

        //select one product and add to card
       // storeManagerPage.btnAddtocart.click();
        clickElementByJS(storeManagerPage.btnAddtocart);
        ReusableMethods.waitFor(3);
        clickElementByJS(storeManagerPage.btnCart);
        storeManagerPage.btnCheckout.click();

       // storeManagerPage.enterYourCode.click();
        ReusableMethods.waitFor(2);

       // storeManagerPage.coupon_codeInput.sendKeys("55555");
       // storeManagerPage.btnApply_coupon.click();

        ReusableMethods.verifyElementDisplayed(storeManagerPage.createdCoupon);




















    }
}
