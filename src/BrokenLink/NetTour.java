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

public class NetTour {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
//			Thread.sleep(5000);
			httpcon.connect();
			
			int rescode = httpcon.getResponseCode();
			if(rescode>=400) {
				System.out.println(url+"==>"+"Link is Broken");
			}else {
				System.out.println(url+"==>"+"Valid");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
