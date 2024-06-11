package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    //locators
    By productName = By.xpath("(//div[@class='product-item-info'])[1]");
    By productSize = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By productColour = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By addedShoppingCarttext=By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.linkText("shopping cart");
    By shoppingCartText = By.xpath("//span[@class='base']");
    By cronusYogaPantsText = By.partialLinkText("Cronus Yoga");
    By sizeText32 = By.xpath("//dd[contains(text(),'32')]");
    By blackColourText = By.xpath("//dd[contains(text(),'Black')]");


    //methods mouse hover on product and click on size and colour
    public void mouseHoverOnProductName() {
        mouseHoverToElement(productName);
    }

    public void clickOnProductSize() {
        clickOnElement(productSize);
    }

    public void clickOnProductColour() {
        clickOnElement(productColour);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }


    //Verify added 'you added cronus pants' msg.
    public String addededToShoppingCatrtText() {
    return getTextFromElement(addedShoppingCarttext);
    }
    //Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
    }
    //Verify the text 'Shopping cart'
    public String shoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    //Verify product name,size and colour
    public String cronusYogaText(){
        return getTextFromElement(cronusYogaPantsText);
    }
    public String sizeText32(){
        return getTextFromElement(sizeText32);
    }
    public String blackColourText(){
        return getTextFromElement(blackColourText);
    }
}
