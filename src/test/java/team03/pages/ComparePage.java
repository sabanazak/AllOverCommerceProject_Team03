package team03.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team03.utilities.Driver;

public class ComparePage {

    public ComparePage() {

            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(id= "data-product_id")
        public WebElement compreButton;
    }





