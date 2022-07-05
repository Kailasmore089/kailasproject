package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MoneyControl {
	public static void main(String[] args) {
		int column;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ssl);
		driver.get("https://www.moneycontrol.com/markets/indian-indices/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 column = driver.findElements(By.xpath("//table[@id='indicesTable']/thead/tr/th")).size();
		
		for(int i=1; i<=1; i++) {
			for(int j=1; j<=column; j++) {
				String value = driver.findElement(By.xpath("//table[@id='indicesTable']/thead/tr["+i+"]/th["+j+"]")).getText();
				System.out.print("="+value);
			}
			System.out.println();
		}
		
		
		
		int rows = driver.findElements(By.xpath("//table[@id='indicesTable']/tbody/tr")).size();
		
		 column = driver.findElements(By.xpath("//table[@id='indicesTable']/tbody/tr[1]/td")).size();
		
		for(int r=1; r<=rows; r++) {
			for(int c=1; c<=column; c++) {
				String value = driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print("="+value);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
