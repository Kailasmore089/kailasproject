package PopUps;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcPopUp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		WebElement Okbtn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		Okbtn.click();
//		
//		WebElement frombox = driver.findElement(By.xpath("driver.manage().window().maximize();"));
//		frombox.sendKeys("Pachora");
//		
//		WebElement ToBox = driver.findElement(By.xpath("//input[@aria-controls='pr_id_2_list']"));
//		ToBox.sendKeys("Pune");
//		
//		WebElement searchbtn = driver.findElement(By.xpath("//button[@label='Find Trains']"));
//		searchbtn.click();
		
		
		Alert aletr = driver.switchTo().alert();
		aletr.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
