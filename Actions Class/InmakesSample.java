package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InmakesSample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\CodingActions\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://lh.inmakesedu.com/home");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);

		WebElement courses = driver.findElement(By.id("navbarDropdown"));
		a.moveToElement(courses).perform();

		WebElement st = driver.findElement(By.xpath("(//div[@class='dropdown dropright p-0 m-0'])[10]"));
		a.moveToElement(st).perform();

		WebElement stMaster = driver.findElement(By.xpath("//a[text()='ST Advanced class'][1]"));
		stMaster.click();
		
		
	}
}
