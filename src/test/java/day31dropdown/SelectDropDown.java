package day31dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement drpcountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpcounter = new Select(drpcountryEle);

		// Select option from drop down
		// drpcounter.selectByVisibleText("Canada");
		// drpcounter.selectByValue("japan");
		// drpcounter.selectByIndex(2);

		// capture the option from the dropdown

		List<WebElement> options = drpcounter.getOptions();
		System.out.println("Number of option in a drop down:" + options.size()); // 10

		// printing the options
		/*
		 * for(int i=0;i<options.size();i++) {
		 * System.out.println(options.get(i).getText()); }
		 */

		// enhanced for loop
		for (WebElement op : options) {
			System.out.println(op.getText());
		}
		

	}

}
