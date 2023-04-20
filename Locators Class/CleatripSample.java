package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleatripSample {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\CodingLocators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://www.cleartrip.com/trains");

		driver.manage().window().maximize();

		WebElement startstation = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		startstation.sendKeys("MGR Chennai Central");

		WebElement endstation = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		endstation.sendKeys("KRS Bangalore");

		WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		date.sendKeys("10/5/2023");

		WebElement cl = driver.findElement(By.xpath("(//option[@value='1A'])[1]"));
		cl.click();

		WebElement children = driver.findElement(By.xpath("(//select[@size='1'])[2]"));
		children.click();

		WebElement seinorMen = driver.findElement(By.xpath("(//select[@size='1'])[3]"));
		seinorMen.click();

		WebElement seniorWomen = driver.findElement(By.xpath("(//select[@size='1'])[4]"));
		seniorWomen.click();

		WebElement search = driver.findElement(By.id("trainFormButton"));
		search.click();

	}

}
