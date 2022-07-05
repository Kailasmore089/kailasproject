package FindElementsFooterLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook1 {
	public static void main (String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> FooterLInks = driver.findElements(By.xpath("//div[@class='col gu12 _3MmGvF']/div/a"));
		
			 
		 for(int i=0; i<FooterLInks.size(); i++) {
			 String text = FooterLInks.get(i).getText();
			 String links = FooterLInks.get(i).getAttribute("href");
			 
			 System.out.println(i+" "+text+"===>"+links);
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
