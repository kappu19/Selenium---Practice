package day38ScreenShot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// Full page screenshot
		/*
		 * TakesScreenshot ts=(TakesScreenshot) driver; File
		 * sourcefile=ts.getScreenshotAs(OutputType.FILE);
		 * 
		 * File targetfile=new
		 * File(System.getProperty("user.dir")+"\\Screenshot\\fullpage.png");
		 * sourcefile.renameTo(targetfile); //copy source file target file
		 */
		// capture the screenshot for specific section
		/*
		 * WebElement featuredproduct=driver.findElement(By.
		 * xpath("//div[@class='product-grid home-page-product-grid']")); File
		 * sourcefile=featuredproduct.getScreenshotAs(OutputType.FILE); File
		 * targetfile=new
		 * File(System.getProperty("user.dir")+"\\Screenshot\\featuredproduct.png");
		 * sourcefile.renameTo(targetfile); //copy source file target file
		 */
		// capture the screenshot of webelement

		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile = logo.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir") + "\\Screenshot\\logo.png");
		sourcefile.renameTo(targetfile);

		//

	}

}
