package org.take;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicProgram {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\TakeScreenShot\\Drivers\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://en-gb.facebook.com/");
		
	   driver.manage().window().maximize();
		
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   
	   File image = ts.getScreenshotAs(OutputType.FILE);
		
	   File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\TakeScreenShot\\WebpageScreenshot\\fblogin.png");
		
      	FileUtils.copyFile(image, f);	
		
		
	}

}
