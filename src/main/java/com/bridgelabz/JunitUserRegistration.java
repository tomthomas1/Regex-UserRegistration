package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * We have created this class to define the regex pattern and match it.
 *  [1]Method to check if firstName passes the regex.
 *  [2]Method to check if lastName passes the regex.
 *  [3]Method to check if email string passes the regex.
 *  [4]Method to check if mobileNumber string passes the regex.
 *  [5]Method to check if password string passes the regex pattern.
 * @author Tom
 *
 */
public class JunitUserRegistration {
	public String regex;

	/**
	 * [1]Method to check if firstName passes the regex.
	 * @param firstName- In this method we pass the firstname to check if it passes the regex pattern.
	 * @return -  The method will return true if the string passed the regex pattern or will return false
	 */
	public boolean firstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	/**
	 * [2]Method to check if lastName passes the regex.
	 * @param lastName- In this method we pass the lastname to check if it passes the regex pattern.
	 * @return -  The method will return true if the string passed the regex pattern or will return false
	 */
	public boolean lastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}


	/**
	 * [3]Method to check if email string passes the regex.
	 * @param emailIds- In this method we pass the email to check if it passes the regex pattern.
	 * @return -  The method will return true if the string passed the regex pattern or will return false
	 */
	public boolean emailId(String emailIds) {
		regex = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailIds);
		return matcher.matches();
	}

	/**
	 * [4]Method to check if mobileNumber string passes the regex.
	 * @param mobileNumber- In this method we pass the mobile to check if it passes the regex pattern.
	 * @return -  The method will return true if the string passed the regex pattern or will return false
	 */
	public boolean mobileNumber(String mobileNumber) {
		regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}

	/**
	 * [5]Method to check if password string passes the regex pattern.
	 * @param password- In this method we pass the password to check if it passes the regex pattern.
	 * @return -  The method will return true if the string passed the regex pattern or will return false
	 */
	public boolean password(String password) {
		regex = "^[a-z](?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}
