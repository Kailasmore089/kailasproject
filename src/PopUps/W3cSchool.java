package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W3cSchool {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ssl);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		
		WebElement trybtn = driver.findElement(By.xpath("//button[text()='Try it']"));
		trybtn.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
//		driver.switchTo().defaultContent();
//		
//		WebElement themebtn = driver.findElement(By.xpath("//a[@onclick='retheme()']"));
//		themebtn.click();
		
		driver.switchTo().parentFrame();
		
		WebElement themebtn = driver.findElement(By.xpath("//a[@onclick='retheme()']"));
		themebtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
