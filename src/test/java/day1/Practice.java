package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	private static final List<WebElement> WebnElement = null;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
/*
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
	
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		System.out.println(logo.isDisplayed());
*/		
		
/*		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtname = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]")));
		txtname.sendKeys("hiii");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//String winID=driver.getWindowHandle();
		//System.out.println(winID);
		Set<String> WindowIds = driver.getWindowHandles();
		for(String winID:WindowIds)
		{
			String title=driver.switchTo().window(winID).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
*/		
		
 /*       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		 Set<String> winIDs = driver.getWindowHandles();
		 
		 for(String winID:winIDs)
		 {
			 String URL=driver.switchTo().window(winID).getTitle();
			 if(URL.equals("OrangeHRM")) {
				 System.out.println(driver.getCurrentUrl());
			 }
		 }
*/		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		*/
		
/*		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));
	
		for(int i=0;i<checkboxes.size();i++)
		{
			for(WebElement checkbox:checkboxes)
			{
				
				System.out.println(checkbox.isSelected());
			}
				
	*/			
			
			
		
		
		
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
			checkbox.isSelected();
		}
		*/
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath(""));
		
		
		
		
		
		
		
		
	}
		
		
	  
	
	
	

}

