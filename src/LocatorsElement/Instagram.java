package LocatorsElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main (String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(99)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		
		
		driver.findElement(By.className("sqdOP  L3NKy   y3zKF     "));
		driver.findElement(By.name("emailOrPhone"));
		driver.findElement(By.name("fullName"));
		driver.findElement(By.className("_2hvTZ pexuQ zyHYP"));
		driver.findElement(By.linkText("Sign up"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
