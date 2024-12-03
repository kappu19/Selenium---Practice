package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void logintest(String email, String pwd) throws InterruptedException
	{
		driver.get("https://demo-opencart.com/index.php?route=account/login&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);//nokef53496@furnato.com
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);//test@123
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
		
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	
	@DataProvider(name="dp", indices= {0,1}) // if run only first two data
	Object[][] loginData()
	{
		Object data [][]= {
				              {"abc@gmail.com", "Test123"},
				              {"john@gmail.com", "Test@123"},
				              {"xyz@gmail.com", "Testxz123"},
				              {"pqr@gmail.com", "Testrr123"},
				              {"mno@gmail.com", "Testmn123"},
		                  };
		return data;
		
	}

}