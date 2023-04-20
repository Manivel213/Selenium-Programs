package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
        driver.get("https://en-gb.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		email.sendKeys("velaneee.trt@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		password.sendKeys("velan4454");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		
		
		
	}

}
