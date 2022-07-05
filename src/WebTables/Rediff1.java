package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rediff1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ssl);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int Column = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th")).size();
		for(int i=1; i<=1; i++) {
			for(int j=1; j<=Column; j++) {
				String text = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th["+j+"]")).getText();
				System.out.print("="+text);
				
			}
			System.out.println();
		}
		
		
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		
		int column = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		
		for(int r=1; r<=rows; r++) {
			for(int c=1; c<=column; c++) {
				String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print("="+value);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
