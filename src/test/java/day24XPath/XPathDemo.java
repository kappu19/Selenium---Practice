package day24XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		// XPath with single attribute
		// driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Phones");

		// XPath with multiple attribute
		// driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Computer");

		// XPath with 'and' 'or' operators
		// driver.findElement(By.xpath("//input[@name='search' and
		// @placeholder='Search']")).sendKeys("Software");
		// driver.findElement(By.xpath("//input[@name='search' or
		// @placeholder='Search']")).sendKeys("Selenium");

		// XPath with inner text or text()
		// driver.findElement(By.xpath("//*[text()='MacBook']")).click(); not working
		boolean displaystatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displaystatus);

		String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(value);

		// XPath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Java");

		// Chained Xpath
		boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(status);

	}

}
