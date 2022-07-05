package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Iframe1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");

		ChromeOptions handlingSSL = new ChromeOptions();		
		handlingSSL.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(handlingSSL);
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_default");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		
		WebElement clickbtn = driver.findElement(By.xpath("//button[text()='Click Me!']"));
		clickbtn.click();
		
		driver.switchTo().defaultContent();
		
		 WebElement Themebtn = driver.findElement(By.xpath("//a[@onclick='retheme()']"));
		 Themebtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
