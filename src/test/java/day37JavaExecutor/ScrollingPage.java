package day37JavaExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1 scroll down page by pixel number

		// js.executeScript("window.scrollBy(0,1100)","");
		// System.out.println(js.executeScript("return window.pageYOffset","")); //1100

		// 2 scroll the page till element is visible
		/*
		 * WebElement elemnt=driver.findElement(By.
		 * xpath("//strong[normalize-space()='Community poll']"));
		 * js.executeScript("arguments[0].scrollIntoView()",elemnt);
		 * System.out.println(js.executeScript("return window.pageYOffset",""));
		 * //2435.199951171875
		 */
		// scroll the page till end of the page

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset", ""));

		// scrolling up to initial position

		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset", ""));

	}

}
