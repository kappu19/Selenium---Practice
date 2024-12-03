package day32WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// find total numbers of rows in a table
		int rows = driver.findElements(By.xpath("//div[@id='HTML1']//div[@class='widget-content']//tr")).size();
		System.out.println("Numbers of Rows:" + rows);

		// find total numbers of coloum in a table
		int coloum = driver.findElements(By.xpath("//div[@id='HTML1']//div[@class='widget-content']//th")).size();
		System.out.println("Numbers of Coloum:" + coloum);

		// Read data from specific rows and coloum // ex 5th row and 1st coloum
		// String
		// bookname=driver.findElement(By.xpath("//div[@id='HTML1']//div[@class='widget-content']//tr[5]//td[1]")).getText();
		// System.out.println("Booksname is:"+bookname);

		// Read all data from the rows and coloum
		/*
		 * for(int r=2;r<=rows;r++) { for(int c=1;c<=coloum;c++) { String
		 * value=driver.findElement(By.xpath(
		 * "//div[@id='HTML1']//div[@class='widget-content']//tr["+r+"]//td["+c+"]")).
		 * getText(); System.out.print(value+"  "); } System.out.println();
		 * 
		 * }
		 */

		// print book name whose author is mukesh

		for (int r = 2; r <= rows; r++) {
			String author = driver.findElement(By.xpath("//div[@id='HTML1']//div[@class='widget-content']//tr[" + r + "]//td[2]"))
					.getText();
			if (author.equals("Mukesh")) {
				String bookname = driver
						.findElement(By.xpath("//div[@id='HTML1']//div[@class='widget-content']//tr[" + r + "]//td[1]"))
						.getText();
				System.out.println(bookname);
			}
		}

		// find total price of all books

		int total = 0;
		for (int r = 2; r <= rows; r++) {
			String Price = driver
					.findElement(By.xpath("//div[@id='HTML1']//div[@class='widget-content']//tr[" + r + "]//td[4]"))
					.getText();
			total = total + Integer.parseInt(Price);

		}
		System.out.println(total); // 7100
	}

}
