package team03.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import team03.pages.*;
import team03.utilities.ConfigReader;
import team03.utilities.Driver;
import team03.utilities.JSUtils;
import team03.utilities.ReusableMethods;

import static team03.tests.saban.TestData.testData;

public class Seyda_test5_tc_1 extends JSUtils {
    WebDriver driver;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AccountDetailsPage accountDetailsPage = new AccountDetailsPage();
    UserRegisterPage userRegisterPage = new UserRegisterPage();
    SeydaAccountPage seydaAccountPage = new SeydaAccountPage();



    @Test
    public void test5() {
       /* Driver.getDriver().get(ConfigReader.getProperty("all_over_commerce_account_url"));

        //loginPage.btnSignIn.isSelected();
        clickElementByJS(loginPage.btnSignIn);
        loginPage.inputSigninUsername.sendKeys(ConfigReader.getProperty("user_name"));
        ReusableMethods.waitFor(2);
        loginPage.inputSiginPassword.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(2);

        //loginPage.chkRememberMe.isSelected();
        clickElementByJS(loginPage.chkRememberMe);

        ReusableMethods.waitFor(2);
        seydaAccountPage.linkSignIn1.click();

//homePage.linkSignIn.click();

      //  clickElementByJS(homePage.linkSignIn);
    //    ReusableMethods.waitFor(2); */



//sign-in as a vendor
        Driver.getDriver().get(ConfigReader.getProperty("all_over_commerce_url"));
        homePage.linkSignIn.click();
        loginPage.inputSigninUsername.sendKeys(ConfigReader.getProperty("user_name"));
        ReusableMethods.waitFor(2);
        loginPage.inputSiginPassword.sendKeys(ConfigReader.getProperty("password"));
        loginPage.btnSignIn.click();

//go to my account page
        myAccountPage.btnSignOut.click();
myAccountPage.linkAccountDetails.click();


       accountDetailsPage.inputAccountFirstName.clear();
accountDetailsPage.inputAccountFirstName.sendKeys("Seyda1");
       ReusableMethods.waitFor(1);
        accountDetailsPage.inputAccountLastName.clear();
accountDetailsPage.inputAccountLastName.sendKeys("Yildiz");

        ReusableMethods.waitFor(1);
        accountDetailsPage.inputDisplayName.clear();

        accountDetailsPage.inputDisplayName.sendKeys("team03.user1");

        ReusableMethods.waitFor(1);
        accountDetailsPage.inputAccountEmail.clear();
accountDetailsPage.inputAccountEmail.sendKeys("team03.user@gmail.com");

       ReusableMethods.waitFor(1);
//accountDetailsPage.inputBiography.sendKeys("1");




        ReusableMethods.waitFor(1);
accountDetailsPage.inputAccountCurrentPassword.sendKeys("TechProEd");
        ReusableMethods.waitFor(1);

accountDetailsPage.inputAccountPassword1.sendKeys("TechProEd");
       ReusableMethods.waitFor(1);

accountDetailsPage.inputAccountPassword2.sendKeys("TechProEd");

       ReusableMethods.waitFor(1);

        //accountDetailsPage.btnSaveChanges.click();
        clickElementByJS(accountDetailsPage.btnSaveChanges);



    }

}

