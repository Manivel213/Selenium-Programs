package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSamplePro {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://lh.inmakesedu.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		Actions a = new Actions(driver);

		WebElement courses = driver.findElement(By.id("navbarDropdown"));
		a.moveToElement(courses).perform();

		WebElement st = driver.findElement(By.xpath("(//div[@class='dropdown dropright p-0 m-0'])[10]"));
		a.moveToElement(st).perform();

		WebElement stMaster = driver.findElement(By.xpath("//a[text()='ST Master Class'][1]"));
		stMaster.click();

	}
}
