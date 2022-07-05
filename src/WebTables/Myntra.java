package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
        ChromeOptions ssl = new ChromeOptions();
        ssl.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(ssl);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement kids = driver.findElement(By.xpath("//a[@data-group='kids']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(kids).build().perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@data-reactid='25']/li/ul/li/a"));
		
		for(int i=0; i<links.size(); i++) {
			WebElement link = links.get(i);
			action.moveToElement(link);
			action.build().perform();
			System.out.println(link.getText()+"==>"+link.getAttribute("href"));
		}
		
		
		
		
		
		
		
		
		
		
	}

}
