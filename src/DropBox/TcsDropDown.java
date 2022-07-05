package DropBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TcsDropDown {
	public static void main (String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nextstep.tcs.com/campus/#/");
		Thread.sleep(8000);
		
		WebElement Registrationbtn = driver.findElement(By.xpath("//button[@class='registerHere greenButton']"));
		Registrationbtn.click();
		Thread.sleep(2000);
		
		WebElement Itbtn = driver.findElement(By.xpath("//button[text()='IT']"));
		Itbtn.click();
		Thread.sleep(2000);
		
		WebElement First = driver.findElement(By.xpath("//input[@id='short_txtFirstName']"));
		
		First.sendKeys("Kailas More");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
