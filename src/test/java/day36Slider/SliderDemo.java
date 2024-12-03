package day36Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		// min slider
		WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Defualt location of min slider: " + min_slider.getLocation()); // (86, 232)

		act.dragAndDropBy(min_slider, 110, 232).perform();

		System.out.println("Location of min slider after moving: " + min_slider.getLocation());

		// max slider
		WebElement max_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("Defualt location of max slider: " + max_slider.getLocation());

	}

}
