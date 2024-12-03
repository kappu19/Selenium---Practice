package day36Slider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		driver.switchTo().newWindow(WindowType.TAB); // open new tab
		driver.switchTo().newWindow(WindowType.WINDOW); // open new window

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
