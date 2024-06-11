package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.Homepage;
import com.softwaretestingboard.magento.pages.WomanPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends BaseTest {

    Homepage homepage = new Homepage();
    WomanPage womenPage = new WomanPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //mouse hover and click
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJacketsLink();

        //Sort by filter'product name'
        List<String> actualText = womenPage.storeProductNamesInAscendingOrder();
        womenPage.selectFilterSortByNames();
        Thread.sleep(2000);
        List<String> expextedText = womenPage.storeProductNamesAfterFilterName();
        Assert.assertEquals(actualText, expextedText);
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //mouse hover and click
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJacketsLink();

        //Sort by filter 'product price'
        List<Double> actualText = womenPage.storeProductsNamesByPriceinAscendingOrder();
        womenPage.selectFilterSortByPriceLowToHigh();
        Thread.sleep(2000);
        List<Double> expectedText = womenPage.storeProductsNamesByPriceAfterFilterPriceLowToHigh();
        Assert.assertEquals(actualText, expectedText);

    }
}
