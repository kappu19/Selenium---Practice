package day34DatePickerDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// input DOB
		String year = "1999";
		String month = "July";
		String date = "19";

		// Switch to frame
		driver.switchTo().frame("frame-one796456169");
		// Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

	}

}
