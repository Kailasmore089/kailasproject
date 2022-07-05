package ScreenAdvanceShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotMethod {
	
	public static WebDriver driver;
	
	public static void getscreenshot(WebDriver driver) throws IOException {
		
		Date d = new Date();
		String value = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\kailas\\Desktop\\Velocity\\Amazon"+value);
		FileUtils.copyFile(src, dest);
		
	}
	

}
