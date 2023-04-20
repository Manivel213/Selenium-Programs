package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSample {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\CodingLocators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.gmail.com/");
		
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.name("//input[@type='email']"));
		mail.sendKeys("velaneee.trt@gmail.com");	
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
}
}