package day42_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	/*
	@Test(priority=1)
	void openapp1()
	{
		System.out.println("open application....");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login application....");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout application....");
	}
	*/
	WebDriver driver;
	
	/*
	@Test(priority=1)
	void openapp()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	void testLogo() throws InterruptedException
	{   Thread.sleep(5000);
		boolean logo=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		if(logo==true) {
		System.out.println("logo is displayed: "+logo);
		}
	}
	
	@Test(priority=3)
	void loginapp()
	{
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	@Test(priority=4)
	void closeapp()
	{
		driver.quit();
	}
	*/
	
	
	@BeforeClass
	@Parameters({"browser"})
	void openapp(String br)
	{
		switch(br)
		{
		case "chrome":driver=new ChromeDriver(); break;
		case "edge":driver=new EdgeDriver(); break;
		case "firefox":driver=new FirefoxDriver(); break;
		default:System.out.println("invalid browser"); return;
		
		}
		
	
		
		//driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	void testLogo() throws InterruptedException
	{   Thread.sleep(5000);
		boolean logo=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		if(logo==true) {
		System.out.println("logo is displayed: "+logo);
		}
	}
	
	@Test(priority=3)
	void loginapp()
	{
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	@AfterClass
	void closeapp()
	{
		driver.quit();
	}
	
	

}
