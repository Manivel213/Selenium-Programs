package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgram {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Debugging\\Drivers\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjgwMDgyMTQzLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement maleButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		maleButton.click();
				
		
		
		
		
		
		
		
		
		
		
	}

}
