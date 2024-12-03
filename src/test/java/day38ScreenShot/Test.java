package day38ScreenShot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		/*
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source_file=ts.getScreenshotAs(OutputType.FILE);
		File target_file=new File(System.getProperty("user.dir")+"//Screenshot//fullpage1.png");
		
		source_file.renameTo(target_file);
		*/
		
		Thread.sleep(5000);
		WebElement text=driver.findElement(By.xpath("//h2[text()='Welcome to our store']"));
		
		File sourcefile=text.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"//Screenshot//halfpage.png");
		sourcefile.renameTo(targetfile);
		
		
		
		

	}

}
