package day42_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 
1) open application
2) test logo presence
3) login
4) close

*/

public class OrangeHRMTest {

	WebDriver driver;

	@Test(priority = 1)
	void openapp() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	void testlogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean logostatus = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo is displayed..." + logostatus);
	}

	@Test(priority = 3)
	void testlogin() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Test(priority = 4)
	void closeapp() {
		driver.quit();
	}

}
