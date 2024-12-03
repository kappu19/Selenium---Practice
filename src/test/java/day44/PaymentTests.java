package day44;

import org.testng.annotations.Test;

public class PaymentTests {

	@Test(priority=1,groups= {"Sanity","Regression"})
	void paymentinRupees()
	{
		System.out.println("Payments in rupees..");
	}
	
	@Test(priority=2,groups= {"Sanity","Regression"})
	void paymentinDollars()
	{
		System.out.println("Payments in dollars");
	}
}
