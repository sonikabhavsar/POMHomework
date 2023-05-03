package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    private By _firstName  = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _emailAddress = By.name("Email");
    private By _Password = By.id("Password");
    private By _ConfirmPassword =By.id("ConfirmPassword") ;
    private By _registerButton =By.id("register-button");


    public void enterRegistrationDetails(){
        typeText(_firstName, "Rahul");
        typeText(_lastName, "patel");
        //type email address
        typeText(_emailAddress, "Rahul1@gmail.com");
       // typeText(_emailAddress, "testemail+" + timestamp() + "@gmail.com");
        //type password
        typeText( _Password, "rahul123456");
        //type confirm password
        typeText(_ConfirmPassword, "rahul123456");
        //click on register submit button
        clickOnElement(_registerButton);
    }
    public void enterRegistrationOneDetails(){
        typeText(_firstName, "Rishi");
        typeText(_lastName, "patel");
        //type email address
        typeText(_emailAddress, "Rai3@gmail.com");
        //type password
        typeText( _Password, "123456");
        //type confirm password
        typeText(_ConfirmPassword, "123456");
        //click on register submit button
        clickOnElement(_registerButton);
    }
    public void enterRegistrationSecondDetails(){
        typeText(_firstName, "Risha");
        typeText(_lastName, "patel");
       //type email address
        typeText(_emailAddress, "Risha@gmail.com");
        //type password
        typeText( _Password, "123456");
        //type confirm password
        typeText(_ConfirmPassword, "123456");
        //click on register submit button
        clickOnElement(_registerButton);
    }


}
