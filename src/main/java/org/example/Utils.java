package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage{
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

    public static void selectDropDownElementByText(By by,String text){
        Select select =new Select((driver.findElement(by)));
        select.selectByVisibleText(text);
    }
    public static void selectDropDownElementByValue(By by,String value){
        Select select1 = new Select(driver.findElement(by));
        select1.selectByValue(value);
    }
    public static void selectDropDownElementByIndex(By by,int  index){
        Select select2 =new Select(driver.findElement(by));
        select2.selectByIndex(index);
    }
    public static void waitForClickable(By by, int timeInSec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
   }
   // public static void waitForNewClickable(By by,int timeInSec){
      //  WebDriverWait wait =new WebDriverWait(driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS));
     //  new WebDriverWait(driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS));

   // }
public static void clickOnRadioButtonElement(By by) {
    driver.findElement(by).click();
}
   //  public static void Thread.sleep(){

  //  }

}
