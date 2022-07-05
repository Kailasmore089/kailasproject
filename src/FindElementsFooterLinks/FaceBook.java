package FindElementsFooterLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> FooterLinks = driver.findElements(By.xpath("//ul[starts-with(@class,'uiList pageFooterLinkList')]/li/a"));
		
		for(int i=0; i<FooterLinks.size(); i++) {
			String Links = FooterLinks.get(i).getAttribute("href");
			String text = FooterLinks.get(i).getText();
			System.out.println(i+" "+text+"===>"+Links);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
