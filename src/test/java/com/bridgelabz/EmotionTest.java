package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;

/**
 *  We have created this class to test the emotion if happy or sad
 * @author Tom
 *
 */
public class EmotionTest {
	EmotionCheck emotion = new EmotionCheck();

	/**
	 * If we created this test case to check if the user is happy.
	 * If happy then it will be true
	 */
    @Test
    public void givenMessage_WhenHappy_ReturnEntrySuccessful() {
        String actualResult = emotion.analyseEmotion("User is Happy");
        Assert.assertEquals("Entry Successful", actualResult);
    }

    /**
	 * If we created this test case to check if the user is sad.
	 */
    @Test
    public void givenMessage_WhenNotProper_ReturnEntryFailed() {
        String actualResult = emotion.analyseEmotion("User is Sad");
        Assert.assertEquals("Entry Failed", actualResult);
    }

}

