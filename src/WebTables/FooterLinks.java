package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FooterLinks {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ssl);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> FooterLinks = driver.findElements(By.xpath("//ul[starts-with(@class,'uiList pageFooterLinkList')]/li/a"));
		
		System.out.println(FooterLinks.size());
		
		for(int i=0; i<FooterLinks.size(); i++) {
		String text = FooterLinks.get(i).getText();
		String links = FooterLinks.get(i).getAttribute("href");
		System.out.println(i+"]"+text+"==>"+links);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
