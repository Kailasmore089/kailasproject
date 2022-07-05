package LocatorsElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlaCabs {
	public static void main (String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(99)\\chromedriver.exe"  );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.olacabs.com/");
		
		driver.findElement(By.linkText("Drive with Ola"));
		
		driver.findElement(By.className("event-elem"));
		
		driver.findElement(By.linkText("Buy / Sell Car"));
		
		driver.findElement(By.className("login-link event-elem"));
		
		driver.findElement(By.linkText("City Taxi"));
		
		driver.findElement(By.linkText("Outstation"));
		
		driver.findElement(By.className("top-icon-container"));
		
		driver.findElement(By.id("addressInput"));
		
		driver.findElement(By.id("icon"));
		
		driver.findElement(By.className("middle text value"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
