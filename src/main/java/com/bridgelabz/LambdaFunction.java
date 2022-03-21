package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *  We have created a lambda function in this class
 *  We have created a function interface and created one method to check regex
 * @author Tom
 *
 */
@FunctionalInterface
interface LambdaFunction {
	boolean checkRegex(String data, String name);
}

class LambdaValidation {
	public static String firstName, lastName, emaIlId, mobileNo, password;
	public static String regexOfFirstName, regexOfLastName, regexOfEmailId, regexOfMobileNo, regexOfPassword;
	public static Scanner scanner = new Scanner(System.in);

	/**
	 * Here we have created the lambda expression where we will pass the regex and the input.
	 * The regex will check and give the output
	 * 
	 */
	public static void main(String[] args) {
		LambdaFunction validation = (regex, input) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			return matcher.matches();
			
		};
		/**
		 * Here we have created the method to check the first name
		 * We will call our checkRegex method to check the regex
		 */
		regexOfFirstName = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println("Enter your FirstName\n" + "First Letter Will be UpperCase\n" + "Should Minimum 3 Characters");
		firstName = scanner.next();
		if (validation.checkRegex(regexOfFirstName, firstName)) {
			System.out.println("Given FirstName is Valid");
		} else {
			System.out.println("Given FirstName is Invalid");
		}

		/**
		 * Here we have created the method to check the last name
		 * We will call our checkRegex method to check the regex
		 */
		regexOfLastName = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println("Enter your LastName\n" + "First Letter Will be UpperCase\n" + "should Minimum 3 Characters");
		lastName = scanner.next();
		if (validation.checkRegex(regexOfLastName, lastName)) {
			System.out.println("Given LastName is Valid");
		} else {
			System.out.println("Given LastName is Invalid");
		}

		/**
		 * Here we have created the method to check the email
		 * We will call our checkRegex method to check the regex
		 */
		regexOfEmailId = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
		System.out.println("Enter your EmailId");
		emaIlId = scanner.next();
		if (validation.checkRegex(regexOfEmailId, emaIlId)) {
			System.out.println("Given EmailId is Valid");
		} else {
			System.out.println("Given EmailId is Invalid");
		}

		regexOfMobileNo = "^[0-9]{2}\\s{1}[0-9]{10}$";
		System.out.println("Enter your MobileNo\n" + "With Country Code");
		mobileNo = scanner.next();
		if (validation.checkRegex(regexOfMobileNo, mobileNo)) {
			System.out.println("Given MobileNo is Valid");
		} else {
			System.out.println("Given MobileNo is Invalid");
		}

		/**
		 * Here we have created the method to check the password
		 * We will call our checkRegex method to check the regex
		 */
		regexOfPassword = "^[a-z](?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";
		System.out.println("Enter your Password\n" + "at least contain One Uppercase, one Numeric, One Special Char\n"
				+ "and minimum 8 field length");
		password = scanner.next();
		if (validation.checkRegex(regexOfPassword, password)) {
			System.out.println("Given Password is Valid");
		} else {
			System.out.println("Given Password is Invalid");
		}
	} 
	
}
