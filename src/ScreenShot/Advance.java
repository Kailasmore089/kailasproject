
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

public class Advance {
	
	public static WebDriver driver;
	
	public static void getscreenshot() throws IOException {
		
		Date d = new Date();
		System.out.println(d);
		String filename = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\kailas\\Desktop\\Velocity\\facebook."+filename);
		FileUtils.copyFile(src, dest);	
	}
	
	
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");	
	driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	getscreenshot();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
