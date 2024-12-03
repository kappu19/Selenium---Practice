package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformKeyboard {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		/*
		 * WebElement username = driver.findElement(By.id("username"));
		 * username.sendKeys("trainee"); Thread.sleep(2000);
		 * username.sendKeys(Keys.CONTROL, "a"); Thread.sleep(2000);
		 * username.sendKeys(Keys.CONTROL, "c");
		 * 
		 * 
		 * WebElement password = driver.findElement(By.name("pwd")); Thread.sleep(2000);
		 * password.sendKeys(Keys.CONTROL, "v"); Thread.sleep(2000);
		 * password.sendKeys(Keys.ENTER);
		 * 
		 */
	}

}
