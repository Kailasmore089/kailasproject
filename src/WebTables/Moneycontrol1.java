package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Moneycontrol1 {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ssl);
		driver.get("https://www.moneycontrol.com/markets/indian-indices/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int column = driver.findElements(By.xpath("//table[@id='indicesTable']/thead/tr/th")).size();
		
		for(int i=1; i<=1; i++) {
			for(int j=1; j<=column; j++) {
				String value = driver.findElement(By.xpath("//table[@id='indicesTable']/thead/tr["+i+"]/th["+j+"]")).getText();
				System.out.print("==>"+value);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
