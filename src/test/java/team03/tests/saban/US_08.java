package team03.tests.saban;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import team03.pages.*;
import team03.tests.AllOverCommerceUtils;
import team03.utilities.ConfigReader;
import team03.utilities.Driver;
import team03.utilities.JSUtils;

public class US_08 {
    HomePage homePage;
    MyAccountPage myAccountPage;
    WishlistPage wishlistPage;
    ShopPage shopPage;


    private void clearWishlist() {
        try{
            for(WebElement removeButton:wishlistPage.removeFromWishlistButtons){
                JSUtils.clickElementByJS(removeButton);
            }
        }
        catch (Exception e) { }
    }

    @Test
    public void test_US08_TC01(){

        AllOverCommerceUtils.loginAsUser();
        homePage=new HomePage();
        myAccountPage=new MyAccountPage();
        wishlistPage=new WishlistPage();
        shopPage=new ShopPage();


        Driver.getDriver().navigate().refresh();  //to overcome Stale Element Reference Exception

        homePage.linkWishlist.click();

        try{
            JSUtils.clickElementByJS(wishlistPage.btnGoShop);
        }catch(Exception e) {
            clearWishlist();
            Driver.waitForVisibility(wishlistPage.btnGoShop,5);
            JSUtils.clickElementByJS(wishlistPage.btnGoShop);
        }
       // Driver.getDriver().navigate().refresh();
        WebElement firstProduct=shopPage.listOfAddToWishListIcons.get(0);
        WebElement lastProduct=shopPage.listOfAddToWishListIcons.get(shopPage.listOfAddToWishListIcons.size()-1);

        JSUtils.clickElementByJS(firstProduct);
        JSUtils.clickElementByJS(lastProduct);

        homePage.linkWishlist.click();

        Assert.assertEquals(2,wishlistPage.addedItemsTableRows.size());

    }

    @Test
    public void test_US08_TC02(){

        AllOverCommerceUtils.loginAsUser();

        homePage=new HomePage();
        myAccountPage=new MyAccountPage();
        wishlistPage=new WishlistPage();
        shopPage=new ShopPage();

        Driver.getDriver().navigate().refresh();  //to overcome Stale Element Reference Exception
        homePage.linkWishlist.click();
        Assert.assertTrue(wishlistPage.addedItemsTableRows.size()>0);

        for(WebElement quickViewButton:wishlistPage.quickViewButtons){
            JSUtils.clickElementByJS(quickViewButton);
            Driver.wait(2);
            //System.out.println(wishlistPage.productAttributesContainerCloseButton.isDisplayed());
            //Driver.waitForVisibility(By.xpath("//div[@class='product-meta-inner']"),5);
//            Assert.assertTrue(wishlistPage.productAttributesContainer.isDisplayed());
            //Driver.waitForClickablility(wishlistPage.productAttributesContainerCloseButton,5);
            //Driver.waitAndClickElement(wishlistPage.productAttributesContainerCloseButton,1);
        }
    }




}
