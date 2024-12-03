package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test
	void textTitle()
	{
		String exp_title="Opencart";
		String act_title="Openshop";  //Opencart
		
		/*
		if(exp_title.equalsIgnoreCase(act_title))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		*/
		
		//type 2
		
		if(exp_title.equalsIgnoreCase(act_title))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
			
		}
		
		
		
		//Assert.assertEquals(exp_title, act_title);
		
		
	}
	
	
	
	
}
