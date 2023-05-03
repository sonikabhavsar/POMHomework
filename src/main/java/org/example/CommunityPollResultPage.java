package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CommunityPollResultPage extends Utils{
    static String expectedCommunityPollVoteMessage = "Only registered users can vote.";
    static String expectedAbleToVoteMessage = "20 vote(s)...";
    public void verifyUserVoteSuccessfully(){

        String actualMessage = getTextFromElement(By.xpath("//div[@class=\"poll-vote-error\"]"));
        System.out.println("My message:" + actualMessage);
        //text message  is disappearing
        Assert.assertEquals(actualMessage, expectedCommunityPollVoteMessage, "Error message is disappearing.");
    }
    public void verifyUserVotesSuccessfully(){
        String actualMessage = getTextFromElement(By.xpath("//span[@class=\"poll-total-votes\"]"));
        System.out.println("My Message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedAbleToVoteMessage, "Total Votes are wrong");
    }
}
