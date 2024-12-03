package day21seleniumstart;
/*
Test Case
------------

1.Launch browser (chrome)
2.Open URL --> https://demo.opencart.com/
3.Validate title should be  "Your Store"
4.close browser
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {

		// 1) Launch browser (chrome)
		// ChromeDriver driver=new ChromeDriver();
		// WebDriver driver=new EdgeDriver();
		WebDriver driver = new ChromeDriver();

		// 2) Open URL --> https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");

		// 3) Validate title should be "Your Store"
		String act_title = driver.getTitle();

		if (act_title.equals("Your Store")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Faild");
		}

		// 4) close browser
		driver.close();
		// driver.quit();

	}

}
