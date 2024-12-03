package day34DatePickerDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		// switch to frame
		driver.switchTo().frame(0);

		// Method 1 :using sendkeys

		// driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("15/05/2024");

		// Method 2: Using Date Picker

		// Input
		String year = "2020";
		String month = "July";
		String date = "19";

		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // open date picker

		// Select Month & year
		while (true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentmonth.equals(month) && currentyear.equals(year)) {
				break;
			}

			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-e']")).click(); //next year
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // previous year

		}

		// Select date

		List<WebElement> alldates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

		for (WebElement dt : alldates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}

	}

}
