package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//driver.switchTo().alert().accept();
		
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		*/
		
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		*/
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		//Thread.sleep(2000);
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Hello");
		myalert.accept();
		
		
		
		
		
	}

}
