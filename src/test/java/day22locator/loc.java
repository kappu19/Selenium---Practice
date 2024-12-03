package day22locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.opencart.com/");
		
		//driver.manage().window().maximize();
		
		// LOCATOR
		/* 
		driver.findElement(By.name("search")).sendKeys("mac");
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("amazon.com");
		

		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_myh38910a_e&adgrpid=155259813513&hvpone=&hvptwo=&hvadid=674893540019&hvpos=&hvnetw=g&hvrand=17610876875049562035&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9144441&hvtargid=kwd-362216169274&hydadcr=5620_2359471&gad_source=1");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Mobiles")).click();
		
		driver.getWindowHandle();
		driver.switchTo();
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println(links);
		*/
		//id
		//driver.get("https://www.google.co.in/");
		//driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Amazon.com");
		
		//tag.class
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("computer");
		
	}

}
