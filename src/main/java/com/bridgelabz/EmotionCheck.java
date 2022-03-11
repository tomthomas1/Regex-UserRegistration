package com.bridgelabz;
/**
 *  We have created this method to check if it is Happy or sad test case
 *  If it is happy then it will return Entry Successful.
 *  3. If it contains sad then it will return Entry Failed
 * @author Tom
 *
 */
public class EmotionCheck {
	public String analyseEmotion(String emotion) {
		if (emotion.toLowerCase().contains("happy")) {
			return "Entry Successful";
		} else if (emotion.toLowerCase().contains("sad")) {
			return "Entry Failed";
		} else
			return null;
	}
}
