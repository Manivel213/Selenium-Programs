package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\CodingActions\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);

//Challenge 1

		// WebElement mobile =
		// driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		// a.moveToElement(mobile).perform();

		// WebElement top =
		// driver.findElement(By.xpath("(//span[@class='linkTest'])[264]"));
		// top.click();

//Challenge 2

		WebElement fashion = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		a.moveToElement(fashion).perform();

		WebElement heels = driver.findElement(By.xpath("(//span[@class='linkTest'])[46]"));
		heels.click();
	}

}
