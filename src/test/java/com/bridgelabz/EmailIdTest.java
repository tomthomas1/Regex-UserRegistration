package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
/**
 *  We have created this class to test the multiple email
 *  We have used he parameter Parameterized tests here. 
 *  Parameterized tests allow a developer to run the same test over and over again using different values. There are five steps that you need to follow to create a parameterized test.
 * 1. Annotate test class with @RunWith(Parameterized.class).
 * 2. Create a public static method annotated with @Parameters that returns a Collection of Objects (as Array) as test data set.
 * 3. Create a public constructor that takes in what is equivalent to one "row" of test data
 * 4. Create an instance variable for each "column" of test data
 * 5. Create your test case using the instance variables as the source of the test data.  
 * @author Tom
 *
 */
@RunWith(Parameterized.class)
public class EmailIdTest {

	        private String emailIds;
	        private boolean expectedResult;

	        public EmailIdTest(String emailIds, boolean expectedResult) {
	            this.emailIds = emailIds;
	            this.expectedResult = expectedResult;
	        }

	        @Parameterized.Parameters
	        public static Collection mailIdsExpectedResult() {
	            return Arrays.asList(new Object[][]{
	                    {"abc@yahoo.com", true},
	                    {"abc-100@yahoo.com", true},
	                    {"abc.100@yahoo.com", true},
	                    {"abc111@abc.com", true},
	                    {"abc-100@abc.net", true},
	                    {"abc.100@abc.com.au", true},
	                    {"abc@1.com", true},
	                    {"abc@gmail.com.com", true},
	                    {"abc+100@gmail.com", true},
	                    {"abc", false},
	                    {"abc@.com.my", false},
	                    {"abc123@gmail.a", false},
	                    {"abc123@.com", false},
	                    {"abc123@.com.com", false},
	                    {".abc@abc.com", false},
	                    {"abc()*@gmail.com", false},
	                    {"abc@%*.com", false},
	                    {"abc..2002@gmail.com", false},
	                    {"abc.@gmail.com", false},
	                    {"abc@abc@gmail.com", false},
	                    {"abc@gmail.com.1a", false},
	                    {"abc@gmail.com.aa.au", false},
	            });
	        }

	        @Test
	        public void givenEmailIds_withExpectedResult_shouldPassAllTheTestCases() {
	            EmailId testEmailIds = new EmailId();
	            boolean result = testEmailIds.emailIdValidator(this.emailIds);
	            Assert.assertEquals(this.expectedResult, result);
	        }
}
