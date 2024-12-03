package day23CSSlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();

		// tag id syntax tag#id

		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Phones");
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Phones");

		// tag class tag.classname

		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Computer");

		// tag attribute 
		
		//tab[Attribute='value'] (except id,class) like name,placeholder
		// etc.

		// driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("Phones");
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Phones");

		// tag class attribute

		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Computer");

	}

}
