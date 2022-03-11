package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  Class to check if the email is valid or not
 *  We have created 2 array of valid and invalid email. Then we pass this Strings of array through loop to check if the email passed the regex pattern.
 * @author Tom
 */
public class TestSampleEmail {

	/**
	 * In this array we have defined all the valid email.
	 */
    static String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

    /**
	 * In this array we have defined all the invalid email.
	 */
    static String[] nonValidEmails = {"abc", "abc@.com.my","abc123@gmail.a", "abc123@.com",
            "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
            "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

    /**
     * In this method we are using a for loop to go through all the email and we are then passing the email to the regex pattern to check if it is valid.
     */
    public void testForValidEmails() {
        System.out.println("Valid Emails\n");
        for (int i = 0; i < validEmails.length; i++) {
            String regex = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(validEmails[i]);
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        System.out.println(" ");
    }
    
    /**
     * In this method we are using a for loop to go through all the email and we are then passing the email to the regex pattern to check if it is not valid.
     */
    public void testForNonValidEmails() {
        System.out.println("Non Valid Emails\n");
        for (int i = 0; i < nonValidEmails.length; i++) {
           String regex = "^[a-zA-Z-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(nonValidEmails[i]);
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}