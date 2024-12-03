package day28Navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();

		// driver.get("https://demo.nopcommerce.com/"); //accept URL only in the String
		// format

		// driver.navigate().to("https://demo.nopcommerce.com/"); //accept URL in the
		// string format and URL object also

		// URL myurl=new URL("https://demo.nopcommerce.com/");
		// driver.navigate().to(myurl);

		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();

	}

}
