package ActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NextCoUk {
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
		
		List<WebElement> Links = driver.findElements(By.xpath("//ul[@data-testid='snail-trail-container']/li/a"));
		
		for(int i=0; i<Links.size(); i++) {
			WebElement Link = Links.get(i);
			Actions action = new Actions(driver);
			action.moveToElement(Link);
			action.build().perform();
			System.out.println(Link.getText());
			Thread.sleep(2000);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
