package org.robotCod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSample {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\CodingRobot\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in");
	
	driver.manage().window().maximize();
	
	Actions a = new Actions(driver);
	
//Challenge 1	
	
	WebElement text = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	text.sendKeys("Inmakes_Infotech");
	a.doubleClick(text).perform();

	
	
		
		
		
		
		
		
}

}
