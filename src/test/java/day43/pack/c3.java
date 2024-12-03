package day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {

	@Test
	void pqr()
	{
		System.out.println("this is pqr from c3");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before suite method...");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("this is after suite method...");
	}
	
}
