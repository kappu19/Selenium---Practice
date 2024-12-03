package day42_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {

	@BeforeClass
	void login()
	{
		System.out.println("login theapplication:");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search a product:");
	}
	
	@Test(priority=2)
	void adv_search()
	{
		System.out.println("adv search a prduct:");
	}
	
	
	@AfterClass
	void logout()
	{
		System.out.println("loout the application");
	}
	
	
}
