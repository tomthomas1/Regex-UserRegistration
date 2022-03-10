package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * In this class we defined and checked the regex pattern.
 * We have used 2 class Pattern and Matcher for checking & matching the pattern
 * [1] We have created this method to check the regex pattern for the first name
 * 
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
}
