package day26Get;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// get(url) - open the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		// getTitle() - return title of the page
		System.out.println(driver.getTitle());

		// getCurrentUrl() - return URL of the page
		System.out.println(driver.getCurrentUrl());

		// getPageSource() - return source code of page
		// System.out.println(driver.getPageSource());

		// getWindowHandle() - return ID of the single browser window
		// String windowid=driver.getWindowHandle();
		// System.out.println("window Id:"+ windowid);
		// //Id40FC287CD454BFA109DDD25C9FA1631A
		// 6BE5215FF420788DA273206AD73E805E
		// getWindowHandles() - return ID's of the multiple browser window

		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will open new browser

		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids); // [D51511B6C76D86E0471AC3A9E3DE68D1, 21682BD27EDA0DA60B5F674149492B09]

	}

}
