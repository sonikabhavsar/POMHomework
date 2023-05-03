package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProductResultPage extends Utils {
    static String expectedCompareProductMessage = "You have no items to compare.";
    public void VerifyToCompareProductsSuccessfully() {
        //Check the compare product
        String actualMessage = getTextFromElement(By.linkText("HTC One M8 Android L 5.0 Lollipop"));
        System.out.println("My Message :" + actualMessage);
        String actualMessage1 = getTextFromElement(By.linkText("$25 Virtual Gift Card"));
        System.out.println("My Message :" + actualMessage1);

        String actualMessage2 = getTextFromElement(By.className("no-data"));
        System.out.println("MyMessage :" + actualMessage2);
        Assert.assertEquals(actualMessage2, expectedCompareProductMessage, "Can not comparing product");
    }
}
