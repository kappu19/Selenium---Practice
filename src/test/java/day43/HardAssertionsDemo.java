package day43;

import org.testng.Assert;

public class HardAssertionsDemo {

	
	void test()
	{
		//Assert.assertEquals("xyz", "xyz");
		//Assert.assertEquals(123, 123);
		
		//Assert.assertEquals("123", 123);
		//Assert.assertEquals("abc", 123);
		
		//Assert.assertNotEquals(123, 123); //faild
		//Assert.assertNotEquals(123, 456);
		
		//Assert.assertTrue(true); //passed
		//Assert.assertTrue(false); //failed
		
		//Assert.assertTrue(1==1); //passed
		//Assert.assertTrue(1==2); //failed
		
		//Assert.assertFalse(1==2); //passed
		//Assert.assertFalse(1==1); //failed
		
		
		
		
		Assert.fail(); // directly fail my test()
		
		
		
		
	}
}
