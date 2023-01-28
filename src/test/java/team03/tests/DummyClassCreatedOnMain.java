package team03.tests;

import org.testng.annotations.Test;
import team03.pages.HomePage;
import team03.utilities.ConfigReader;
import team03.utilities.Driver;

public class DummyClassCreatedOnMain {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("all_over_commerce_url"));
        HomePage homePage=new HomePage();
        homePage.linkRegister.click();
    }
}
