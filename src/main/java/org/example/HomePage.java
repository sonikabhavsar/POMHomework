package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePage extends Utils{
    private By _registerButton = By.className("ico-register");
    private  By _productList =By.cssSelector("div.product-grid h2");
    private  By _searchButton =By.cssSelector("button.search-box-button");
    private By _voteButton=By.cssSelector("#vote-poll-1");
  
    private By CurrencyUSDollar = By.cssSelector("select#customerCurrency");
    private   By currencyEuro = By.cssSelector("select#customerCurrency");
    private   By priceList = By.xpath("//span[contains(@class,'price actual-price')]");
    private By _searchProduct = By.cssSelector("input#small-searchterms");
   private By _productGrid = By.cssSelector("div.product-grid h2");
    private  By _buildYourOwnComputer =By.xpath("(//a[@href='/build-your-own-computer'])[2]");
    private By _facebookTab =By.xpath("//a[@href='http://www.facebook.com/nopCommerce']");
    private By _welcomeMessage = By.cssSelector("div.topic-block-title h2");


        public void clickOnRegisterButton() {
        clickOnElement((_registerButton));
    }
    public void printOutForTheTitle(){
        List<WebElement>productList = driver.findElements(_productList);
        for (WebElement e :productList){
            System.out.println(e.getText());
        }
    }
    public void verifyPrintPopUpMessage(){
            //click the search button
        clickOnElement(_searchButton);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Please enter some search keyword");
        alert.accept();
    }
    public void verifyToPrintVoteAlertMessage(){
        //click the vote button
        clickOnElement(_voteButton);
        Alert alert1 =driver.switchTo().alert();
        Assert.assertEquals(alert1.getText(),"Please select an answer");
        alert1.accept();
    }
    public void verifyToSeeNewReleaseNews(){

        clickOnElement(By.partialLinkText("nopCommerce new release!"));
    }
    public void verifySelectCurrency(){

        //   selectDropDownElementByText(_selectCurrency, "Euro");
        //select US Dollar currency
        selectDropDownElementByText(CurrencyUSDollar,"US Dollar");
        System.out.println("Customer Currency accordingly chanced : ");

        //print featured product price in US Dollar to verify currency
        List<WebElement>productPrices = driver.findElements(priceList);
        for (WebElement e:productPrices){
            System.out.println(e.getText());
        }
        //select Euro currency
        selectDropDownElementByText(currencyEuro,"Euro");
        System.out.println("Customer Currency accordingly chanced : ");

        //print featured product price in Euro to verify currency
        List<WebElement>productPrices2 = driver.findElements(priceList);
        for (WebElement e:productPrices2){
            System.out.println(e.getText());
        }
    }
    public void verifySelectedProductBrand(){
            //type the brand in search box
            typeText(_searchProduct,"apple");
            //click the search button
            clickOnElement(_searchButton);
        List< WebElement> productList =driver.findElements(_productGrid);
        for (WebElement e:productList) {
            System.out.println(e.getText());
        }
        }
        public void verifyUserShouldBeBuildYourOwnComputer(){
            clickOnElement(_buildYourOwnComputer);
        }
        public void verifyUserShouldGoFacebookWindow(){
            String MainWindow = driver.getWindowHandle();
            clickOnElement(_facebookTab);
            // To handle all new opened window.
            Set<String> s1 = driver.getWindowHandles();
            Iterator<String> i1 = s1.iterator();

            while (i1.hasNext()) {
                String ChildWindow = i1.next();
                if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                    driver.switchTo().window(ChildWindow);
                }
            }
        }
    public void welcomeToOurStore () {
        String expectedWelcomeMessage = "Welcome to our store";
        String actualMessage = getTextFromElement(_welcomeMessage);
        System.out.println("get message on Homepage:" + actualMessage);
        //Close URL
        Assert.assertEquals(actualMessage, expectedWelcomeMessage, "Welcome Homepage");
    }
}







