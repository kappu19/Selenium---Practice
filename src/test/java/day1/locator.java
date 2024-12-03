package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--incognito");
		
		driver.get("https://demo.opencart.com/");
		//driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	 	String text=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
	 	System.out.println(text);
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("KAPIL");
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("xyz");
		//driver.findElement(By.cssSelector("input[name=search]")).sendKeys("asdf");
		//driver.findElement(By.linkText("Cameras")).click();
		//driver.findElement(By.name("search")).sendKeys("Hello");
		//driver.close();
		

	}

}
