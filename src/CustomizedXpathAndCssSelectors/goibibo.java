package CustomizedXpathAndCssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibibo {
	public static void main (String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(99)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
//		1] Basic Xpath
		
//		  WebElement Flightsicon = driver.findElement(By.xpath("//a[@class='nav-link active']"));
//		  Flightsicon.click();
//		  
//		  driver.navigate().back();
		 
//		2] Xpath by Text()
		  
		WebElement HotelIcon = driver.findElement(By.xpath("//a[text()='Hotels']"));
		HotelIcon.click();
		
		WebElement Icon = driver.findElement(By.xpath("//h4[text()='India']"));
		Icon.click();
		
//		3] Xpath by Start-with
		
		WebElement Landmark = driver.findElement(By.xpath("//input[starts-with(@class,'HomePageAutos')]"));
		
		Landmark.sendKeys("Mumbai Region, India");
		
		  
		  
		
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
