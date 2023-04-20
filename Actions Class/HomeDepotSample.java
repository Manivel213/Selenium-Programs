package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepotSample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\CodingActions\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.homedepot.com");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
//challenge 1		
		
		//WebElement dept = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		//a.moveToElement(dept).perform();
		
		//WebElement heat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		//a.moveToElement(heat).perform();
		
		//WebElement aircon = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
		//a.moveToElement(aircon).perform();
		
		//WebElement portable = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		//portable.click();
		
//Challenge 2 
		
		WebElement dept = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		a.moveToElement(dept).perform();
		
		WebElement paint = driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(paint).perform();
		
		WebElement interior = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(interior).perform();
		
		WebElement ceiling = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		ceiling.click();		
		
	}
	
	

}
