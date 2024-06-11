package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {
    By womenMenu = By.xpath("//span[text()='Women']");
    By topsMenu = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacketsLink = By.id("ui-id-11");

    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottomSubMenu = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pantsSubMenu = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    By gearMenu=By.xpath("//span[normalize-space()='Gear']");
    By bagMenu=By.xpath("//span[normalize-space()='Bags']");


//Women menu
    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(topsMenu);
    }

    public void clickOnJacketsLink() {
        mouseHoverToElementAndClick(jacketsLink);
    }

//Men menu
    public void mouseHoverOnmenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottoms() {
        mouseHoverToElement(bottomSubMenu);
    }

    public void clickOnPantsSubMenu(){
        clickOnElement(pantsSubMenu);
    }

   //Gear menu
    public void mouseHoverOnGear(){
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBagMenu(){
        clickOnElement(bagMenu);
    }
}
