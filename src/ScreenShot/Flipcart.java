package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	
	public static WebDriver driver;
	
	public static void getscreenshot() throws IOException {
		
		Date d = new Date();
		String value = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File ("C:\\Users\\kailas\\Desktop\\Velocity\\flipcart"+value);
		FileUtils.copyFile(src, dest);
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		getscreenshot();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
