package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpcart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();  
		
		WebElement SearchBox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		SearchBox.sendKeys("Iphone"+Keys.ENTER);
		
		 WebElement text = driver.findElement(By.xpath("//div[text()='APPLE iPhone SE (Red, 64 GB)']"));
		 if(text.isDisplayed()) {
			 System.out.println("Passed");
		 }
		 else {
			 System.out.println("Failed");
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
