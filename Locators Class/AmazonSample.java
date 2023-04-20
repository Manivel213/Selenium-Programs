package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
//Challenge 1
		
		//WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		//searchBox.sendKeys("iphone");

		//WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		//submit.click();
		
//Challenge 2
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("Silver Bracelet");

		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();		
	}

}
