package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
1) Login --@BeforeMethod 
2) search  --@Test
3) logout  --@AfterMethod
4) login  
5) adv search --@Test 
6)logout  
*/ 


public class AnnotationsDemo1 {

	
	@BeforeMethod
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
		System.out.println("this is advsearch....");
	}
	
    @AfterMethod
	void logout()
	{
		System.out.println("this is logout.....");
	}
	
	
	
	
	
}
