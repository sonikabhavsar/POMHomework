package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By registerButton = By.className("ico-register");
    public void clickOnRegisterButton() {
        clickOnElement((registerButton));


    }
}
