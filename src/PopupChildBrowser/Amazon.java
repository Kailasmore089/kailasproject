package PopupChildBrowser;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		Set<String> winds;
		Iterator<String> iterator;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pogolinks.bond/movies/raw-beast-2022/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		  winds = driver.getWindowHandles();
		iterator = winds.iterator();
		String FirstWindow = iterator.next();
		System.out.println(FirstWindow);
		driver.switchTo().window(FirstWindow);
		
		driver.findElement(By.xpath("//a[text()='Raw (Beast) (2022) [Hindi] 480p HQ PreDVD Rip [465.95 MB]']")).click();
		
		 winds = driver.getWindowHandles();
		iterator = winds.iterator();
		iterator.next();
		 String SecondWindow = iterator.next();
		 System.out.println(SecondWindow);
		 
		 driver.switchTo().window(SecondWindow);
		 
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
