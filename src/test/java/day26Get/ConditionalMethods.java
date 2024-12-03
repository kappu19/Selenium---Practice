package day26Get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		// isDisplayed

		// WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo
		// store']")); //findElement always return type is webElement
		// System.err.println("Display status logo:" +logo.isDisplayed());//true

		// boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo
		// store']")).isDisplayed();
		// System.out.println("Display status logo:"+ logo);

		// isEnabled

		// boolean
		// status=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		// System.out.println("Enable status:"+ status);

		// isSelected

		WebElement male_rdb = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rdb = driver.findElement(By.xpath("//input[@id='gender-female']"));

		System.out.println("Before Selection........");
		System.out.println(male_rdb.isSelected()); // false
		System.out.println(female_rdb.isSelected()); // false

		System.out.println("After Selecting male.......");
		male_rdb.click(); // select male radio button

		System.out.println(male_rdb.isSelected()); // true
		System.out.println(female_rdb.isSelected());// false

		System.out.println("After Selecting female.......");
		female_rdb.click(); // select female radio button

		System.out.println(male_rdb.isSelected()); // false
		System.out.println(female_rdb.isSelected());// true

	}

}
