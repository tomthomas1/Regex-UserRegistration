package com.bridgelabz;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
/**
 * In this class we have written the Test cases and check if the method passes the test case.
 * We have used the AssertTrue & False to check if the string passes the pattern.
 * @author Tom
 *
 */
public class UserRegistrationTest {
	UserRegistration exceptionUserRegistration = new UserRegistration();

	/**
	 * In this test case we will pass the first name and use the assert method to check if the test result is true.
	 * @throws InputInvalidException - We will throw the custom exception. 
	 */
	@Test
    public void firstName() throws InputInvalidException {
        String firstName = "Tom";
        Assert.assertTrue(exceptionUserRegistration.testFirstName(firstName));
    }

	/**
	 * In this test case we will pass the last name and use the assert method to check if the test result is true.
	 * @throws InputInvalidException - We will throw the custom exception. 
	 */
    @Test
    public void lastName() throws InputInvalidException {
        String lastName = "Thomas";
        Assert.assertTrue(exceptionUserRegistration.testLastName(lastName));
    }

    @Test
    public void emailId() throws InputInvalidException {
        String emailId = "tom.thomas437@gmail.com";
        Assert.assertTrue(exceptionUserRegistration.testEmailId(emailId));
    }

    @Test
    public void mobileNumber() throws InputInvalidException {
        String mobileNumber = "91 9876543212";
        Assert.assertTrue(exceptionUserRegistration.testMobileNumber(mobileNumber));
    }

    /**
	 * In this test case we will pass the password and use the assert method to check if the test result is true.
	 * @throws InputInvalidException - We will throw the custom exception. 
	 */
    @Test
    public void password() throws InputInvalidException{
        String password = "qw98hRL@&dl";
        Assert.assertTrue(exceptionUserRegistration.testPassword(password));
    }
}
