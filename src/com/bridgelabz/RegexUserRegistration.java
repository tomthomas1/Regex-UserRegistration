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
    /**
     * We take the input and pass it to the method to check if the last name is valid
     */
    public void userLastName() {
        System.out.println("Enter Your Last Name : ");
        String lastName = scanner.next();
        userDetails.lastName(lastName);
    }
    /**
     * We take the input and pass it to the method to check if the emailId is valid
     */
    public void userEmailId() {
        System.out.println("Enter Your EmailId : ");
        String emailId = scanner.next();
        userDetails.emailId(emailId);
    }
}
