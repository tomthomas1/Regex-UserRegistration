package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * In this class we defined and checked the regex pattern.
 * We have used 2 class Pattern and Matcher for checking & matching the pattern
 * [1] We have created this method to check the regex pattern for the first name
 * [2] We have created this method to check the regex pattern for the last name
 * [3] Method to check the regex pattern for the emailId 
 * [4] Method to check the regex pattern for the mobile number format
 * [5] Method to check the regex pattern for the password
 * @author Tom
 *
 */
public class UserDetails {
    public String regex;

    /**
     * [1] We have created this method to check the regex pattern for the first name
     * 1 We are passing the first name to this method
     * 2. Then we define the regex pattern
     * 3. First name starts with Cap and has minimum 3 characters
     * 4. We have used the compile method of the pattern class to create the object for the pattern
     * 5. Then we use the Matcher class to interpret the pattern object & it checks the string passed if it matches the pattern
     * 6. Then we are using the matches() method which will return a boolean value to check if it matches or not.
     * @param firstName - Here we pass the first name of the user to check
     */
    public void firstName(String firstName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry!! InValid Input");
        }
    }
    
    /**
     *[2] We have created this method to check the regex pattern for the last name
     * 1 We are passing the last name to this method
     * 2. Then we define the regex pattern
     * 3. Last name starts with Cap and has minimum 3 characters
     * @param lastName - Here we pass the last name of the user to check
     */
    public void lastName(String lastName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry!! InValid Input");
        }
    }
    /**
     *[3] We have created this method to check the regex pattern for the emailId
     * 1 We are passing the email to this method
     * 2. Then we define the regex pattern
     * 3. E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
     * @param emailId - we have passed the email id to check the regex
     */
    public void emailId(String emailId) {
        regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";
        Pattern pattern  = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("InValid");
        }
    }
    /**
     *[4] Method to check the regex pattern for the mobile number format
     * 1 We are passing the mobile number to this method
     * 2. Then we define the regex pattern
     * Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number
     * @param mobileNumber -  we have passed the mobile number to check the regex
     */
    public void mobileNumber(String mobileNumber) {
        regex = "^(\\d{1,3}[- ]?){1}\\d{9,10}$";
        Pattern pattern  = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry!! InValid Input");
        }
    }
    /**
     *[5] Method to check the regex pattern for the password 
     *Rule1- minimum 8 Characters
     *Rule2 – Should have at least 1 Upper Case
     * 1 We are passing the mobile number to this method
     * 2. Then we define the regex pattern
     * @param password
     */
    public void password(String password) {
        regex = "^(?=.*[A-Z]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry!! InValid Input");
        }
    }
}

