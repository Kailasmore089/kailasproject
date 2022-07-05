package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.0_4");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement Clickbtn = driver.findElement(By.xpath("//button[text()='Show an Alert']"));
		Clickbtn.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
