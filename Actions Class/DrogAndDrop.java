package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogAndDrop {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		
		WebElement debitsite = driver.findElement(By.xpath("//a[text()=' BANK '][1]"));
		WebElement act = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(debitsite, act).perform();
		
		WebElement crd = driver.findElement(By.xpath("//a[text()=' SALES '][1]"));
		WebElement ant = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(crd, ant).perform();
		
		WebElement debAmt = driver.findElement(By.xpath("//a[text()=' 5000 '][1]"));
		WebElement amt = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(debAmt, amt).perform();

		WebElement crdamt = driver.findElement(By.xpath("//a[text()=' 5000 '][1]"));
		WebElement ammt = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(crdamt, ammt).perform();
		

}
}
