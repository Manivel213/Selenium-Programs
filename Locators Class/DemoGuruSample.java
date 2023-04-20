package org.sam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuruSample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		WebElement frstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		frstname.sendKeys("Velan");

		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastname.sendKeys("Mani");

		WebElement address = driver.findElement(By.xpath("(//textarea[@ng-model='Adress'])[1]"));
		address.sendKeys("Tiruttani");

		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		email.sendKeys("velaneee.trt@gmail.com");

		WebElement phnumber = driver.findElement(By.xpath("(//input[@type='tel'])[1]"));
		phnumber.sendKeys("9677994549");

		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		male.click();

		WebElement cricket = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		cricket.click();

		WebElement language = driver.findElement(By.xpath("(//li[@class='ng-scope'])[8]"));
		language.click();

		WebElement skills = driver.findElement(By.xpath("//option[@value='Javascript']"));
		skills.click();

		WebElement country = driver.findElement(By.xpath("//span[@title='India']"));
		country.click();

		WebElement year = driver.findElement(By.xpath("//option[@value='1992']"));
		year.click();

		WebElement month = driver.findElement(By.xpath("//option[@value='June']"));
		month.click();

		WebElement day = driver.findElement(By.xpath("//option[@value='7']"));
		day.click();

		WebElement pass = driver.findElement(By.id("firstpassword"));
		pass.sendKeys("velan");

		WebElement secondpassword = driver.findElement(By.id("secondpassword"));
		secondpassword.sendKeys("velan");

		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();

	}

}
