package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CustomizedWebTable {
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
        ChromeOptions ssl = new ChromeOptions();
        ssl.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(ssl);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement creatbtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		creatbtn.click();
		
	
		WebElement month =driver.findElement(By.xpath("//select[@aria-label='Month']"));
				
				Actions act = new Actions(driver);
				//Step.3 Use Action class method to Select Option
				act.click(month).perform();
				Thread.sleep(3000);
				//Step.4 Move to End
				act.sendKeys(Keys.END).perform();
				for(int i=0; i<=4; i++)
				{
				act.sendKeys(Keys.ARROW_UP).perform();
				Thread.sleep(1000);
				}
				act.sendKeys(Keys.ENTER).perform();
				}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	


