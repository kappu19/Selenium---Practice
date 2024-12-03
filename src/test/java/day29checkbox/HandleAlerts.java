package day29checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		// normal alert popup with OK button
		/*
		 * driver.findElement(By.
		 * xpath("//button[normalize-space()='Click for JS Alert']")).click();
		 * Thread.sleep(5000);
		 * 
		 * //driver.switchTo().alert().accept();
		 * 
		 * Alert myalert=driver.switchTo().alert();
		 * System.out.println(myalert.getText()); myalert.accept();
		 */

		// confirmation Alert - OK & Cancel
		/*
		 * driver.findElement(By.
		 * xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		 * Thread.sleep(5000);
		 * 
		 * driver.switchTo().alert().accept(); // close alert using OK button
		 * //driver.switchTo().alert().dismiss(); // close alert using Cancel button
		 */

		// Prompt alert- Input box

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);

		Alert myalert = driver.switchTo().alert();
//variable alert type(Alert),assign to variable(myalerrt)
		myalert.sendKeys("Welcome");
		myalert.accept();

	}

}
