package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NewReleaseNewsResultPage extends Utils{
    static String expectedGuestMessage ="News comment is successfully added.";
    static String expectedGuestMessage1 ="good service";

   private By _comments = By.cssSelector("div.comment-body");
    public void verifyUserSeeNewReleaseNewsResultSuccessfully(){


        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println("My message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedGuestMessage, "News comment is successfully added.");//"Guest Window");

        String actualMessageNew =getTextFromElement(By.xpath("(//div[@class='comment-content'])[3]"));
        System.out.println("my message :" +actualMessageNew);
        Assert.assertEquals(actualMessageNew,expectedGuestMessage1,"good service");
        List<WebElement> productList =driver.findElements(_comments);
        for (WebElement e:productList){
            System.out.println(e.getText());
    }

}}
