package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	public void onStart(ITestContext context) {
	//onStart() will execute only once  before starting all the tests   
		System.out.println("Test execution is started....");
		
	  }
	
	public void onTestStart(ITestResult result) {
	//onTestStart() will execute multiple times for multiple test()   
		System.out.println("Test started.....");
		
	  }
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test passed.....");
	  }
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test failed.....");
	  }

	
	public void onTestSkipped(ITestResult result) {
	    System.out.println("Test skipped....");
	  }
	
	
	public void onFinish(ITestContext context) {
	    System.out.println("Test execution is completed......");
		
	}
	
	
	
}
