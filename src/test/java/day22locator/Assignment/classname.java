package day22locator.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.demoblaze.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total numbers of links:" + links.size());

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total numbers of images:" + images.size());

		// driver.findElement(By.id("article")).click();
		driver.findElement(By.linkText("Samsung galaxy s6")).click();

	}

	
	
}
