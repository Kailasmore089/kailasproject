package PopupChildBrowser;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook1 {
	public static void main(String[] args) {
		Set<String> winds;
		 Iterator<String> iterator;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	     winds = driver.getWindowHandles();
	    iterator = winds.iterator();
	    String FirstWindow = iterator.next();
	    System.out.println(FirstWindow);
	    driver.switchTo().window(FirstWindow);
	    
	    WebElement paybtn = driver.findElement(By.xpath("//a[text()='Facebook Pay']"));
	    paybtn.click();
	    
	   winds = driver.getWindowHandles();
	  iterator = winds.iterator();
	  iterator.next();
	  String SecondWindow = iterator.next();
	  System.out.println(SecondWindow);
	  
	  driver.switchTo().window(SecondWindow);
	  
	  driver.findElement(By.xpath("//a[@href='https://www.facebook.com/payments_terms/EU_privacy']")).click();
	  
	  winds = driver.getWindowHandles();
	    iterator = winds.iterator();
	    iterator.next();
	    iterator.next();
	   String ThirdWindow = iterator.next();
	   System.out.println(ThirdWindow);
	   driver.switchTo().window(ThirdWindow);
	   
	  WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
	  Username.sendKeys("ABCD");
	  
	    WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	    pass.sendKeys("123456");
	    
	    System.out.println("++++++++++++++++++++++++++++++++Reswitching To First Window ++++++++++++++++++++++++++++++++++++");
	    
	    driver.switchTo().window(FirstWindow);
	    
	    WebElement Username1 = driver.findElement(By.xpath("//input[@id='email']"));
		  Username1.sendKeys("ABCD");
		  
		    WebElement pass1 = driver.findElement(By.xpath("//input[@id='pass']"));
		    pass1.sendKeys("123456");
		    
	    
	  
	   
	  
	   
	    
	     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
