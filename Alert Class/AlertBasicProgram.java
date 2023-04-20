package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBasicProgram {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\AlertClass\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
//SimpleAlertMethod
		
		//WebElement button = driver.findElement(By.xpath("//button[contains(text(),'alert box')]"));
		//button.click();
		//Thread.sleep(3000);
		//Alert a = driver.switchTo().alert();
		//String info = a.getText();
		//System.out.println(info);
		
//PromptAlertMethod
		
		WebElement alertWithText = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alertWithText.click();
		
		WebElement alertBox = driver.findElement(By.xpath("//button[contains(text(),'prompt box ')]"));
		alertBox.click();
		
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.sendKeys("Inmakes Infotech");
		a.accept();
	}

}
