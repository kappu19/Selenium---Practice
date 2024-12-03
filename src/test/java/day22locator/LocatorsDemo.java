package day22locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize(); // for browser open full window

		// Name Locator
		// driver.findElement(By.name("search")).sendKeys("mac");

		// Id

		// boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
		// System.out.println(logoDisplayStatus);
		// driver.close();

		// Linktext & partial Linktext

		// driver.findElement(By.linkText("Tablets")).click();
		// driver.findElement(By.partialLinkText("Table")).click();

		// classname
		List<WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));
		System.out.println("Total numbers of links:" + headerlinks.size());

		// tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:" + links.size());

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images:" + images.size());

	}

}
