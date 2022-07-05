package ActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nextco {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ssl);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.next.co.uk/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement CLosebtn = driver.findElement(By.xpath("//button[@aria-label='Close']"));
		CLosebtn.click();
		
		WebElement home = driver.findElement(By.xpath("//div[text()='HOME']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(home).build().perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@data-testid='catalogue']/div/div/ul/li/a"));
		
		for(int i=0; i<links.size(); i++) {
			WebElement link = links.get(i);
//			Actions action = new Actions(driver);
			action.moveToElement(link);
			action.build().perform();
			System.out.print(i+"]"+link.getText());
			System.out.println("==>"+link.getAttribute("href"));
			Thread.sleep(1000);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
