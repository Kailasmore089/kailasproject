package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionFlipcart {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	          WebElement Username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	          Username.sendKeys("9503642581");
	          
	          WebElement Password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	          Password.sendKeys("Kailas@123");
	          
	           WebElement Loginbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	           Loginbtn.click();
		
		
		
		
		
	}

}
