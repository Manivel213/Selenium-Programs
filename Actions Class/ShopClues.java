package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\CodingActions\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.shopclues.com/wholesale.html");

		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
//Challenge 1
		
		//WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		//a.moveToElement(mobile).perform();
		
		//WebElement apple = driver.findElement(By.xpath("(//a[@target='_blank'])[9]"));
		//apple.click();
		//System.out.println("A product name : Apple ");	
		
//Challenge 2 
		
		WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(sports).perform();
		
		WebElement weight = driver.findElement(By.xpath("(//a[@target='_blank'])[299]"));
		weight.click();
			
	}

}
