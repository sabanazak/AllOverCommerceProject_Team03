package team03.tests.comparetests;

import org.testng.annotations.Test;
import team03.pages.ComparePage;
import team03.utilities.ConfigReader;
import team03.utilities.Driver;

public class CompareTestLogin {

    @Test
    public void compareTest(){
        ComparePage ComparePage = new ComparePage();
        Driver.getDriver().get(ConfigReader.getProperty("url_commerce"));
        ComparePage.compreButton.click();




    }



}
