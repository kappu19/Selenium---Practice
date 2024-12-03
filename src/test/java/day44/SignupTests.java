package day44;

import org.testng.annotations.Test;

public class SignupTests {

	@Test(priority=1,groups= {"Regression"})
	void signupbyemail()
	{
		System.out.println("This is signup by email..");
	}
	
	@Test(priority=2,groups= {"Regression"})
	void signupbyfb()
	{
		System.out.println("This is signup by fb..");
	}
	
	@Test(priority=3,groups= {"Regression"})
	void signupbytwitter()
	{
		System.out.println("This is signup by twitter..");
	}
}
