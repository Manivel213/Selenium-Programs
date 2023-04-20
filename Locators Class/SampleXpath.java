package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleXpath {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
        driver.get("https://en-gb.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("velaneee.trt@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("velan");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		//driver.close();
		
		
	}

}
