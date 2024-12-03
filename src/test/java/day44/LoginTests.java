package day44;

import org.testng.annotations.Test;

public class LoginTests {

	@Test(priority=1,groups= {"Sanity"})
	void loginByEmail()
	{
		System.out.println("This is login by email...");
	}
	
	@Test(priority=2,groups= {"Sanity"})
	void loginByfb()
	{
		System.out.println("This is login by Fb...");
	}
	
	@Test(priority=3,groups= {"Sanity"})
	void loginByTwitter()
	{
		System.out.println("This is login by Twitter...");
	}
}
