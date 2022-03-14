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
public class UserRegistration {
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
	 *  In this method we will check for exception for the first name.
	 *  If the first name is valid then it will print valid.
	 *  If the first name is Invalid then it will throw the exception and print the message.
	 * @param firstName - We will pass the first name to this method.
	 * @return - The method will compute and return a boolean value true if correct pattern.
	 * @throws InputInvalidException - We will throw the custom exception.  
	 */
	public boolean testFirstName(String firstName) throws InputInvalidException {
        try {
            if (!firstName(firstName)) {
                throw new InputInvalidException("Entered FirstName is Invalid\n" +
                        "First name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered FirstName is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred " + e);
            e.printStackTrace();
        }
        return firstName(firstName);
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
	 *  In this method we will check for exception for the last name.
	 *  If the last name is valid then it will print valid.
	 *  If the last name is Invalid then it will throw the exception and print the message.
	 * @param lastName - We will pass the last name to this method.
	 * @return - The method will compute and return a boolean value true if correct pattern.
	 * @throws InputInvalidException - We will throw the custom exception & is used to declare an exception
	 */
	public boolean testLastName(String lastName) throws InputInvalidException {
        try {
            if (!lastName(lastName)) {
                throw new InputInvalidException("Entered LastName is Invalid\n" +
                        "Last name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered LastName is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
            e.printStackTrace();
        }
        return lastName(lastName);
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
	
	public boolean testEmailId(String emailId) throws InputInvalidException {
        try {
            if (!emailId(emailId)) {
                throw new InputInvalidException("Entered EmailId is Invalid");
            } else {
                System.out.println("Entered EmailId is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return emailId(emailId);
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
	
	public boolean testMobileNumber(String mobileNumber) throws InputInvalidException {
        try {
            if (!mobileNumber(mobileNumber)) {
                throw new InputInvalidException("Entered MobileNumber is Invalid\n" +
                        "Mobile Number Must Contain Country Code");
            } else {
                System.out.println("Entered MobileNumber is Valid\n");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return mobileNumber(mobileNumber);
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
	
	public boolean testPassword(String password) throws InputInvalidException {
        try {
            if (!password(password)) {
                throw new InputInvalidException("Entered Password is Invalid\n" +
                        "Password Must Contain at least\n" +
                        "one Uppercase, one Numeric, one Special Char\n" +
                        "and minimum 8 Characters ");
            } else {
                System.out.println("Entered Password is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return password(password);
    }
}

