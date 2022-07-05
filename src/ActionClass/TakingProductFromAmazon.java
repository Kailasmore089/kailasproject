package ActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakingProductFromAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

		
		driver.get("https://www.amazon.in/stores/U-S-FBATHACCESSORIES/page/A98A0D48-6C30-48C3-BE03-C2D7B2332512");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.xpath("//div[contains(@class,'ProductGrid__gridContainer')]/ul/li"));
		
		for(int i=0; i<links.size(); i++) {
			 WebElement link = links.get(i);
			 Actions action = new Actions(driver);
			 action.moveToElement(link);
			 action.build().perform();
			 System.out.println(i+"] "+link.getText());
			 Thread.sleep(1000);
		}
	

	
	
	
	
	
	
	
	
	
	
	}
}
