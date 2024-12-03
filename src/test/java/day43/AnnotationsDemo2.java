package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
1) login  --@BeforeClass
2) search --@Test
3) advsearch  --@Test
4)logout  -- @AfterClass
*/

public class AnnotationsDemo2 {

	@BeforeClass
	void login()
	{
		System.out.println("this is login....");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("this is search....");
	}
	
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("this is advsearch.....");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("this is logout.....");
	}
	
	
	
	
	
	
}
