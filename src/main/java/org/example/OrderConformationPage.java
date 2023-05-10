package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderConformationPage extends Utils{
    static String expectedMessage1 ="Billing Address";
    private By _orderNumber =By.xpath("//div[@class='order-number']/strong");
    private By _continueButton =By.xpath("//button[@class='button-1 order-completed-continue-button']");

    public void verityUserShouldSeeOrderConformation(){
        String actualMessage = getTextFromElement(By.xpath("(//div[@class='title'])[1]"));
        System.out.println("My message:" + actualMessage);
        Assert.assertEquals(actualMessage,expectedMessage1 , "Your order has not be processed");
        String actualMessage1=getTextFromElement(_orderNumber);
        System.out.println("confirm:"+actualMessage1);
        //click the continue button
        clickOnElement( _continueButton);
    }
}
