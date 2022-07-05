package ScreenAdvanceShot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static WebDriver driver;
	
	public static void main  (String args[]) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ScreenShotMethod.getscreenshot(driver);
		
		WebElement Searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Searchbox.sendKeys("thomson tv 55 inch android");
		
	   WebElement Searchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	   Searchbtn.click();
		
		ScreenShotMethod.getscreenshot(driver);
		
		
		
		
		
		
		
		
		
		
	}

}
