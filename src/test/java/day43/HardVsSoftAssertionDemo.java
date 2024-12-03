package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertionDemo {

	/*
	@Test
	void test_hardassertions()
	{
		System.out.println("testing.....");
		System.out.println("testingg.....");
		
		Assert.assertEquals(1, 1);
		//Assert.assertEquals(1, 2);
		
		System.out.println("testinggg.....");
		System.out.println("testingggg.....");
	}
	*/
	
	@Test
	 void test_softassertions() 
	 {
		System.out.println("testing.....");
		System.out.println("testingg.....");
		
		SoftAssert sa=new SoftAssert();
				
		sa.assertEquals(1, 2); //soft assertions
		
		
		System.out.println("testinggg.....");
		System.out.println("testingggg.....");
		
		sa.assertAll(); //mandatory
	 }

}
