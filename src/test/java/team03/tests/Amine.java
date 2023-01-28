package team03.tests;

import org.testng.annotations.Test;
import team03.utilities.ConfigReader;
import team03.utilities.Driver;

public class Amine {
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
}
