package LocatorsElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddifmail {
	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(99)\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
//		1] NAME 
		

//		 1) Element (Full name TextBox)
		driver.findElement(By.name("name244a0a92"));
		driver.manage().window();
		
//		2) Element (Choose rediffmail ID TextBox)
		driver.findElement(By.name("login244a0a92"));
		
//		3) Element (Password TextBox)
		driver.findElement(By.name("passwd244a0a92"));
		
//		4) Element (Retype Password)
		driver.findElement(By.name("confirm_passwd244a0a92"));
		
//		5) Element  (Alternative Email ID)
		driver.findElement(By.name("confirm_passwd244a0a92"));
		
		
//		2] CLASS
		
//		1) check Availability Button
		driver.findElement(By.className("btn_checkavail"));
		
		
//		3] TAGNAME
		
//		1) Element (Captcha)
		driver.findElement(By.tagName("img"));
		
//		4] ID
		
//		1) Element (Create my account button)
		
		driver.findElement(By.id("Register"));
		
		
//		1) Relative Xpath
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		
//		2) Absolute Xpath
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[2]"));
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
