package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSample {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\CodingLocators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		WebElement webSite = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		
		webSite.sendKeys("Inmakes learning hub");
		
		WebElement click = driver.findElement(By.xpath("//span[contains(text(),'inmakes learning hub chennai')]"));
		click.click();
		
		

	}
}
