package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    @BeforeMethod
    public void openBrowser() {
        //driver = new ChromeDriver();
        driver = new ChromeDriver();
        //type the url
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
    @AfterMethod

    public  void closeBrowser() {
        driver.close();
    }

}

