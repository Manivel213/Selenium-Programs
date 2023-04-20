package org.CodAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\CodingAlert\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();
		
//Challenge 1(Simple Alert)
		
		//WebElement button = driver.findElement(By.xpath("//button[contains(text(),'alert box')]"));
		//button.click();
		//Alert a = driver.switchTo().alert();
		//String info = a.getText();
		//System.out.println(info);
		
//Challenge 2 (Confirm Alert)	
		
		//WebElement button = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		//button.click();
		//WebElement button1 = driver.findElement(By.xpath("//button[contains(text(),'confirm box')]"));
		//button1.click();
		//Alert a1 = driver.switchTo().alert();
		//String info = a1.getText();
		//System.out.println(info);
		
//Challenge 3 (Prompt Alert)
		
		WebElement button = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		button.click();
		WebElement button2 = driver.findElement(By.xpath("//button[contains(text(),'prompt box ')]"));
		button2.click();
		Alert a2 = driver.switchTo().alert();
		String info = a2.getText();
		System.out.println(info);
		a2.sendKeys("Inmakes Infotech");
		a2.accept();
		
	}

}
