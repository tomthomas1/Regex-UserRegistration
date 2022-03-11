package com.bridgelabz;

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
