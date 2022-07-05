package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(103)\\chromedriver.exe");
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(ssl);
		
		driver.get("https://www.moneycontrol.com/markets/indian-indices/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int row = driver.findElements(By.xpath("//table[@id='indicesTable']/tbody/tr")).size();
		int column = driver.findElements(By.xpath("//table[@id='indicesTable']/tbody/tr[1]/td")).size();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=column; j++) {
				String text = driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+"==>");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
