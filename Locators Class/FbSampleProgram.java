package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbSampleProgram {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\CodingLocators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
        driver.get("https://en-gb.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
		mail.sendKeys("velaneee.trt@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("velan");
	
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		login.click();

}
}

