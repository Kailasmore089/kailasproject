package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.facebook.com/");
	    
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	  WebElement Creataccbtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	  Creataccbtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
