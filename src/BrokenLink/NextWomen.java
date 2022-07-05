package BrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NextWomen {
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ssl);
		
		
		driver.get("https://www.next.co.uk/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement closebtn = driver.findElement(By.xpath("//button[@aria-label='Close']"));
		closebtn.click();
		
		WebElement Women = driver.findElement(By.xpath("//div[text()='WOMEN']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(Women).build().perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='catalogue']/div/div/ul/li/a"));
		
		for(int i=0; i<links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			HttpURLConnection httpcon=(HttpURLConnection)link.openConnection();
			httpcon.connect();
			
			int rescode = httpcon.getResponseCode();
			
			if(rescode>=400) {
				System.out.println(i+"]"+url+"==>"+"Link is Broken");
			}else {
				System.out.println(i+"]"+url+"==>"+"Valid");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
