package org.example;

import org.openqa.selenium.By;

public class NewReleaseNewsDetailsPage extends Utils{
    private By _title =By.cssSelector("input.enter-comment-title");

    private By _comment = By.cssSelector("textarea#AddNewComment_CommentText");

    private By _submitNewComment =By.xpath("//button[@name='add-comment']");

    private By _displayAllNewComment =By.className("comment-list");

    public void verifyUserSeeNewReleaseDetails(){
        //type tittle
        typeText(_title,"hello everyone");
        //type comment
        typeText(_comment, "good service");
        //click submit button
        clickOnElement(_submitNewComment);
        //clickOnElement(_displayAllNewComment,"");
      //getTextFromElement( _displayAllNewComment);
    }
}
