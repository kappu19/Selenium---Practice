package day44;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {

	
	@Test(priority=1)
	void login()
	{
		System.out.println("login the application:");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods= {"login"})
	void search()
	{
		System.out.println("search a product:");
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void adv_search()
	{
		System.out.println("adv search a prduct:");
	}
	
	
	@Test(priority=4, dependsOnMethods= {"login"})
	void logout()
	{
		System.out.println("loout the application");
	}
}
