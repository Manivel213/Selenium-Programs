package org.take;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingChallenges {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\TakeScreenShot\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//Challenge 1	
		
		//driver.get("https://lh.inmakesedu.com/");

		//driver.manage().window().maximize();
	      
		// TakesScreenshot ts = (TakesScreenshot)driver;

		// File image = ts.getScreenshotAs(OutputType.FILE);

		// File f = new
		// File("C:\\Users\\ELCOT\\eclipse-workspace\\TakeScreenShot\\WebpageScreenshot\\inmakesedu.png");

		// FileUtils.copyFile(image, f);
		
//Challenge 2 
		
		//driver.get("https://snapdeal.com/");

		//driver.manage().window().maximize();
		
		//TakesScreenshot ts1 = (TakesScreenshot) driver;

		//File image = ts1.getScreenshotAs(OutputType.FILE);

		//File f1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\TakeScreenShot\\WebpageScreenshot\\snapdeal.png");

		//FileUtils.copyFile(image, f1);
		
//Challenge 3 
		
		driver.get("https://amazon.in/");

		driver.manage().window().maximize();
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;

		File image = ts2.getScreenshotAs(OutputType.FILE);

		File f2 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\TakeScreenShot\\WebpageScreenshot\\amazon.png");

		FileUtils.copyFile(image, f2);
	
}
}
