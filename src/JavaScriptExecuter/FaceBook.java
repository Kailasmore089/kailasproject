package JavaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		System.out.println(SeleniumUtils.titlebyjs(driver));
		
		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		SeleniumUtils.Clickbyjs(driver, forgot);
		
		SeleniumUtils.alertbyjs(driver, "Forggot Password PAge LaunchSuccessfully !!");
		
		
		
		
		
		
		
//		WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
//		
//		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
//		
//		WebElement Loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
//		
//		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].style.border='7px solid red'", Username);
//		js.executeScript("arguments[0].style.border='7px solid red'", pass);
//		js.executeScript("arguments[0].style.border='7px solid red'", Loginbtn);
//		js.executeScript("arguments[0].style.border='7px solid red'", forgot);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
