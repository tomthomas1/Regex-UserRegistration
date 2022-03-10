package com.bridgelabz;

import java.util.Scanner;
/**
 * We have created this class to take the pass the input from the user to the methods.
 * We have created the object of the UserDetails to use the methods.
 * @author Tom
 *
 */
public class RegexUserRegistration {

	Scanner scanner = new Scanner(System.in);
    UserDetails userDetails = new UserDetails();

    /**
     * We take the input and pass it to the method to check.
     */
    public void userFirstName() {
        System.out.println("Enter Your First Name : ");
        String firstName = scanner.next();
        userDetails.firstName(firstName);
    }
}
