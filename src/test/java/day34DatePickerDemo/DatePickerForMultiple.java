package day34DatePickerDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerForMultiple {

	static void selectFutureDate(WebDriver driver, String year, String month, String date) {
		while (true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentmonth.equals(month) && currentyear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // next year
			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-w']")).click(); //previous year

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

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		// switch to frame
		driver.switchTo().frame(0);

		// for multiple

		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // open date picker
		// 1st way
		String year = "2025";
		String month = "July";
		String date = "19";

		selectFutureDate(driver, year, month, date);

		// 2nd way

		// selectFutureDate(driver,"2025","July","19");

	}

}
