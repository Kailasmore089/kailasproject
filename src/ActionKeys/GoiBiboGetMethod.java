package ActionKeys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoiBiboGetMethod {
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		Thread.sleep(2000);
		
//		1] GetText
		
		String Actual = driver.findElement(By.xpath("//div[@class='header__contInners']/h2")).getText();      //******
		String Expected = "Domestic and International Flights";
		
		if(Actual.equals(Expected)) {
			System.out.println("Test Case passed");
		}else {
			System.out.println("Test Case Failed");
		}
		
		System.out.println(Actual);
		
//		2] getAttribute();
		
//		
		String Actual1 = driver.findElement(By.xpath("//a[text()='Trains']")).getAttribute("class");
		String Expected1 = "nav-link .";
	
		if(Actual1.equals(Expected1)) {
			System.out.println("Test Case Actual Passed");
		}else {
			System.out.println("Test Case Failed Actual");
		}
		
	System.out.println(Actual1);
		
//		3] Multiple Elements
	
	 List<WebElement> FooterLinks = driver.findElements(By.xpath("//div[@class='footer-links']/ul/li/a"));  
	
	System.out.println("Total Footer Links Available :- "+FooterLinks.size());
		
	for(int i=0; i<FooterLinks.size(); i++) {
		String Links = FooterLinks.get(i).getAttribute("href");
		String text = FooterLinks.get(i).getText();
		System.out.println(i+" "+Links+"==>"+text);
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
