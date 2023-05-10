package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    HomePage homePage= new HomePage();

    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    CommunityPollPage communityPollPage = new CommunityPollPage();
    CommunityPollResultPage communityPollResultPage = new CommunityPollResultPage();
    EmailToFriendPage emailToFriendPage =new EmailToFriendPage();
    EmailToFriendResultPage emailToFriendResultPage = new EmailToFriendResultPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ShoppingCartResultPage shoppingCartResultPage = new ShoppingCartResultPage();
    CompareProductPage compareProductPage = new CompareProductPage();
    CompareProductResultPage compareProductResultPage = new CompareProductResultPage();
    LoginPage loginPage =new LoginPage();
    NewReleaseNewsDetailsPage newReleaseNewsDetailsPage =new NewReleaseNewsDetailsPage();
    BuildYourOwnComputerDetailsPage buildYourOwnComputerDetailsPage =new BuildYourOwnComputerDetailsPage();
    NewReleaseNewsResultPage newReleaseNewsResultPage = new NewReleaseNewsResultPage();
    BuildYourOwnComputerResultPage buildYourOwnComputerResultPage =new BuildYourOwnComputerResultPage();
    CheckOutAsGuest checkOutAsGuest =new CheckOutAsGuest();
    OrderConformationPage orderConformationPage = new OrderConformationPage();
    FacebookPage facebookPage = new FacebookPage();
    @Test
    public void VerifyUserShouldBeAbleToRegisterSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //enter register details
        registerPage.enterRegistrationDetails();
        //verify user register successfully
        registerResultPage.VerifyUserRegisterSuccessfully();
    }
    @Test
    public void VerifyUserShouldBeAbleToCommunityPollVoteSuccessfully(){
        //click on good button
       communityPollPage.enterCommunityPollDetails();
       //click on vote button
        communityPollResultPage.verifyUserVoteSuccessfully();
    }
    @Test
    public void VerifyUserShouldBeAbleToSendEmailToFriend(){
        //click on email friend button
        emailToFriendPage.enterSendFriendMailDetails();
        //verify user send email a friend
        emailToFriendResultPage.verifyUserSendEmailFriendSuccessfully();
    }
    @Test
    public  void VerifyUserShouldBeAbleToAddProductToShoppingCart(){
        //To add product in shopping cart
        shoppingCartPage.VerifyDetailsOfAddProductInShoppingCart();
        //Verify in shopping cart added product is same product
        shoppingCartResultPage.VerifyToSeeSameProductInShoppingCart();
    }
    @Test
    public void VerifyUserShouldBeAbleToCompareProduct(){
        //enter compare product details
      compareProductPage.VerifyToDetailsOfCompareProduct();
      //verify the compare product successfully
      compareProductResultPage.VerifyToCompareProductsSuccessfully();
    }
    @Test
    public  void VerifyUserShouldBeAbleToReferProductToFriend(){
        //click on register button
        homePage.clickOnRegisterButton();
        //enter register details
        //registerPage.enterRegistrationDetails();
        registerPage.enterRegistrationOneDetails();
        //verify user register successfully
       // registerResultPage.VerifyUserRegisterSuccessfully();
        //click on login button
      loginPage.enterLoginDetails();
      //click on email friend button
       // emailToFriendPage.enterSendFriendMailDetails();
        emailToFriendPage.enterSendFriendMailNewDetails();
        //verify user send email a friend
        emailToFriendResultPage.VerifyUserSendEmailFriendsSuccessfully();
    }
    @Test
    public  void VerifyUserShouldBeAbleTOVote(){
        //click on register button
       homePage.clickOnRegisterButton();
       //enter register details
        // registerPage.enterRegistrationSecondDetails();
        registerPage.enterRegistrationOneDetails();
         //verify user register successfully
        registerResultPage.VerifyUserRegisterSuccessfully();
        //click on login button
        loginPage.enterLoginDetails();
        //click on good button
        communityPollPage.enterCommunityPollDetails();
        //click on vote button
        communityPollResultPage.verifyUserVotesSuccessfully();
    }
@Test
    public void VerifyUserShouldBeAblePrintProductList(){
        homePage.printOutForTheTitle();
}
@Test
    public void VerifyUserShouldSeePopUpMessage(){
        homePage.verifyPrintPopUpMessage();
}
@Test
    public void VerifyUserShouldBeAbleToSeeVotePopUpMessage(){
        homePage.verifyToPrintVoteAlertMessage();
}
@Test
   public void VerifyUserShouldBeAbleToSeeNewReleaseNews(){
        homePage.verifyToSeeNewReleaseNews();
        newReleaseNewsDetailsPage.verifyUserSeeNewReleaseDetails();
        newReleaseNewsResultPage.verifyUserSeeNewReleaseNewsResultSuccessfully();
}
@Test
public void VerifyUserShouldBeAbleToSelectCurrency(){
        homePage.verifySelectCurrency();

}
@Test
public void VerifyUserShouldBeAbleToSelectedBrand(){
        homePage.verifySelectedProductBrand();
}
@Test
    public void VerifyUserShouldBeAbleToBuildYourOwnComputer(){
        homePage.verifyUserShouldBeBuildYourOwnComputer();
        buildYourOwnComputerDetailsPage.verifyUserShouldEnterAllDetailsOfBuildYourOwnComputer();
        buildYourOwnComputerResultPage.productInShoppingCart();
       buildYourOwnComputerResultPage.checkOut();
       checkOutAsGuest.CheckOutAsGuestSuccessfully();
       checkOutAsGuest.BillingAddress();
        checkOutAsGuest.PaymentInformation();
        orderConformationPage.verityUserShouldSeeOrderConformation();

}
@Test
    public void VerifyUserShouldBeAbleToOpenFacebookWindow(){
        homePage.verifyUserShouldGoFacebookWindow();
        facebookPage.verifyUserShouldFacebookWindowOpen();
        homePage.welcomeToOurStore();

}


}
