package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;

public class EmotionTest {
	EmotionCheck emotion = new EmotionCheck();

    @Test
    public void givenMessage_WhenHappy_ReturnEntrySuccessful() {
        String actualResult = emotion.analyseEmotion("User is Happy");
        Assert.assertEquals("Entry Successful", actualResult);
    }

    @Test
    public void givenMessage_WhenNotProper_ReturnEntryFailed() {
        String actualResult = emotion.analyseEmotion("User is Sad");
        Assert.assertEquals("Entry Failed", actualResult);
    }

}

