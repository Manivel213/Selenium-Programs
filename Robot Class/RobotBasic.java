package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotBasic {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/login/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Inmakes");
		
		Robot r = new Robot();

		Actions a = new Actions(driver);

		a.doubleClick(email).perform();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
//KeyUp and KeyDown Arguments
		
		//driver.get("https://en-gb.facebook.com/login/");

		//driver.manage().window().maximize();

		//Robot r = new Robot();

		//Actions a = new Actions(driver);

		//WebElement email = driver.findElement(By.id("email"));
		
		//a.keyDown(Keys.SHIFT).sendKeys(email, "inmakes").keyUp(Keys.SHIFT).perform();

	}

}
