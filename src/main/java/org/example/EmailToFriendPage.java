package org.example;

import org.openqa.selenium.By;

public class EmailToFriendPage extends Utils{
    private By _emailafriend  = By.className("email-a-friend");
    private By _friendemailAddress = By.className("friend-email");
    private By _youremailAddress = By.className("your-email");
    private By _sendemail = By.name("send-email");

    public void enterSendFriendMailDetails(){
        //click on product
        clickOnElement(By.xpath("//a[@ href=\"/apple-macbook-pro-13-inch\"]"));
        //click on email a friend
        clickOnElement(_emailafriend );
        //Enter friend email
        typeText(_friendemailAddress, "Rajpatel12@gmail.com");
        //Enter your email
        typeText(_youremailAddress, "Rahul1234@gmail.com");
        //click on send email button
        clickOnElement(_sendemail);
    }
    public void enterSendFriendMailNewDetails(){
        //click on product
        clickOnElement(By.xpath("//a[@ href=\"/apple-macbook-pro-13-inch\"]"));
        //click on email a friend
        clickOnElement(_emailafriend );
        //Enter friend email
        typeText(_friendemailAddress, "Rajpatel12@gmail.com");
        //Enter your email
      //  typeText(_youremailAddress, "Rahul1234@gmail.com");
        //click on send email button
        clickOnElement(_sendemail);

}
}
