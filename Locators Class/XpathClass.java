package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		String pageTitle = driver.getTitle();
		
		System.out.println("Current PageTitle :" + pageTitle);
		
		String pageUrl = driver.getCurrentUrl();
		
		System.out.println("Current PageUrl : " + pageUrl);
		
		driver.close();
		
		//driver.quit();
	}
	
}
