package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.Homepage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    Homepage homepage = new Homepage();
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductsSuccessfully() {
        homepage.mouseHoverOnmenMenu();
        homepage.mouseHoverOnBottoms();
        homepage.clickOnPantsSubMenu();

        menPage.mouseHoverOnProductName();
        menPage.clickOnProductSize();
        menPage.mouseHoverOnProductName();
        menPage.clickOnProductColour();
        menPage.mouseHoverOnProductName();
        menPage.clickOnAddToCart();

        //Verify the success msg.
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = menPage.addededToShoppingCatrtText();
        Assert.assertEquals(actualText, expectedText);

        //click on shopping cart and verify the text 'shopping cart'
        menPage.clickOnShoppingCart();

        String expectedText1="Shopping Cart";
        String actualText1=menPage.shoppingCartText();
        Assert.assertEquals(actualText1,expectedText1);

        //Verify the product name ‘Cronus Yoga Pant’
        expectedText = "Cronus Yoga Pant";
        actualText = menPage.cronusYogaText();
        Assert.assertEquals(actualText, expectedText);
        //Verify the product size ‘32’
        expectedText = "32";
        actualText = menPage.sizeText32();
        Assert.assertEquals(actualText, expectedText);
        Assert.assertEquals("32", getTextFromElement(By.xpath("//dd[contains(text(),'32')]")));
        //Verify the product colour ‘Black’
        expectedText = "Black";
        actualText = menPage.blackColourText();
        Assert.assertEquals(actualText, expectedText);


    }
}
