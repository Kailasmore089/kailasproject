package PopupChildBrowser;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		Set<String> winds;
		Iterator<String> iterator;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		winds = driver.getWindowHandles();
		iterator = winds.iterator();
		String FirstWindow = iterator.next();
		System.out.println(FirstWindow);
		
		WebElement Facebookpay = driver.findElement(By.xpath("//a[text()='Facebook Pay']"));
		Facebookpay.click();
		
		winds = driver.getWindowHandles();
		iterator = winds.iterator();
		iterator.next();
		String SecondWindow = iterator.next();
		System.out.println(SecondWindow);
		
		driver.switchTo().window(SecondWindow);
		System.out.println(driver.getCurrentUrl());
		
		WebElement paylink = driver.findElement(By.xpath("//a[text()='Facebook Community Payments Terms']"));
		paylink.click();
		
		winds = driver.getWindowHandles();
		 iterator = winds.iterator();
		 iterator.next();
		 iterator.next();
		 String ThirdWindow = iterator.next();
		 System.out.println(ThirdWindow);
		 driver.switchTo().window(ThirdWindow);
		 
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("ABCD");
		
		WebElement Pass = driver.findElement(By.xpath("//input[@id='pass']"));
		Pass.sendKeys("KAILAS");
		
		
		
		
		
		
		
		
		
		
	}

}
