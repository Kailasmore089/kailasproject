package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverLocators {
	public static void main (String args []) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(99)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");
		driver.findElement(By.name("submit_search" )).click();
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(By.id("search_query_top")).sendKeys("blouse");
		driver.findElement(By.name("submit_search")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
