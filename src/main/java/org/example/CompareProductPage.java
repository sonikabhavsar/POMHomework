package org.example;

import org.openqa.selenium.By;

public class CompareProductPage extends Utils{
    private By _HTCOneM8AndroidL50Lollipop = By.linkText("HTC One M8 Android L 5.0 Lollipop");
    private  By _divclasscompareproductsbutton =By.xpath("//div[@class='compare-products']/button");
    private  By _GiftCards =By.linkText("Gift Cards");
    private  By _$25VirtualGiftCard =By.linkText("$25 Virtual Gift Card");
    private By _buttoncontainsclassbutton2addtocomparelistbutton =By.xpath("//button[contains(@class,'button-2 add-to-compare-list-button')]");
    private By _productcomparison =By.linkText("product comparison");
    private By _clearlist =By.className("clear-list");

public void VerifyToDetailsOfCompareProduct(){
    //select product
    clickOnElement(_HTCOneM8AndroidL50Lollipop);
    //click compare button
    clickOnElement(_divclasscompareproductsbutton);
    //select product
    clickOnElement(_GiftCards);
    clickOnElement(_$25VirtualGiftCard);
    //click compare product
    //clickOnElement(By.xpath("//div[@class='compare-products']/button"));
    clickOnElement(_buttoncontainsclassbutton2addtocomparelistbutton);
    //product comparison
    clickOnElement(_productcomparison);
    //click clear-list button
    clickOnElement(_clearlist);
}
}
