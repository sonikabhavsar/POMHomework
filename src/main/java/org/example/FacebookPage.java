package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class FacebookPage extends Utils{

   private By _allowCookiesButton = By.xpath("(//div[contains(@aria-label,'Allow all cookies')])[2]");
   private    By _emailAddress = By.xpath("//*[@id=\"login_form\"]/div[2]/div[1]/label/input");
   private   By _password = By.xpath("//*[@id=\"login_form\"]/div[2]/div[2]/label/input");
   private By _loginButton = By.xpath("//*[@id=\"login_form\"]/div[2]/div[3]/div/div/div[1]/div/span/span");
   private   By _closeButton = By.xpath("//div[@aria-label='Close']");


    public void verifyUserShouldFacebookWindowOpen() {

        String currentURL = driver.getCurrentUrl();
        System.out.println("URL:");
        System.out.println(currentURL);
        //check url
        Assert.assertEquals(currentURL, "https://www.facebook.com/nopCommerce");
        //click to allowCoockies button
        clickOnElement(_allowCookiesButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(_closeButton));
        clickOnElement(_closeButton);
        System.out.println("Below things are verifying:");

        if (driver.findElements(_emailAddress).size() != 0) {
            System.out.println("Email Place Holder is Present");
        } else {
            System.out.println("Email Place Holder is Absent");
        }
        if (driver.findElements(_password).size() != 0) {
            System.out.println("Password Place Holder Present");
        } else {
            System.out.println("Password Place Holder Absent");
        }
        if (driver.findElements(_loginButton).size() != 0) {
            System.out.println("Login Button is Present");
        } else {
            System.out.println("Login Button is Absent");
        }
        String ChildWindow = driver.getWindowHandle();
        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String MAinWindow = i1.next();
            if (!ChildWindow.equalsIgnoreCase(MAinWindow)) {
                driver.switchTo().window(MAinWindow);
            }
        }

    }}