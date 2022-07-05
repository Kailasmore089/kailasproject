package DropBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook1 {
	public static void main (String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement Creataccbtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Creataccbtn.click();
		Thread.sleep(2000);
		
		WebElement BirthDay = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Select s = new Select(BirthDay);
		
		s.selectByVisibleText("22");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
