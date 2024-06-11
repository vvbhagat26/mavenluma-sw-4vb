package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.Homepage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    Homepage homepage=new Homepage();
    GearPage gearPage=new GearPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        //Mouse Hover on Gear Menu
        homepage.mouseHoverOnGear();
        //Click on Bags
        homepage.clickOnBagMenu();
        //Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffle();
        //Verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
        String actualText = gearPage.getOverNightDuffleText();
        Assert.assertEquals(actualText, expectedText);
        //Change Qty 3
        gearPage.changeQtyTo3();
        //Click on ‘Add to Cart’ Button.
        gearPage.clickOnAddToCartButton();
        //Verify the text 'You added Overnight Duffle to your shopping cart.’
        expectedText = "You added Overnight Duffle to your shopping cart.";
        actualText = gearPage.getAddToShoppingCartText();
        Assert.assertEquals(actualText, expectedText);
        //Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCartLink();
        //Verify the product name ‘Overnight Duffle’
        expectedText = "Overnight Duffle";
        actualText = gearPage.getOverNightDufText();
        Assert.assertEquals(actualText, expectedText);
        //Verify the Qty is ‘3’
        expectedText = "3";
        actualText = gearPage.getAttributeForQty3();
        Assert.assertEquals(actualText, expectedText);
        //Verify the product price ‘$135.00’
        expectedText = "$135.00";
        actualText = gearPage.getProductPrice();
        Assert.assertEquals(actualText, expectedText);
        //Change Qty to ‘5’
        gearPage.changeQtyTo5();
        //Click on ‘Update Shopping Cart’ button
        gearPage.clickOnUpdateShoppingCartButton();
        //Verify the product price ‘$225.00
        expectedText = "$225.00";
        actualText = gearPage.getUpdatedPrice();
        Assert.assertEquals(actualText, expectedText);
    }

    }

