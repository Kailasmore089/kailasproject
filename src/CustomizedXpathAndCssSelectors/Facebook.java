package CustomizedXpathAndCssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main (String [] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(99)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
//		1] Basic Xpath Syntax
//		//tagname[@attribute='attribute value']
		
		driver.findElement(By.xpath("//input[@name='email']"));
		 
//		2] Xpath by Text
		//tagname[text()='Forgotten password?']
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
//		3] Xpath starts-with
		
		driver.findElement(By.xpath("//input[starts-with(@class,'inputtext ')]"));
		
		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal_email')]")); 
		
//		4]Xpath by Contains
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'or phone')]"));
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]"));
		
//		5] Xpath by Logical Operator and , or
		
		driver.findElement(By.xpath("//input[@name='email' and @data-testid='royal_email']"));
		
		driver.findElement(By.xpath("//input[@type='text' or @placeholder='Email address or phone number']"));
		
		
//		  Css Selectors
		
//		1] Tag and name
		
		WebElement Username =  driver.findElement(By.cssSelector("input#email"));
		
		Username.sendKeys("Kailas");
		
//		2] Tag and class
		
		WebElement CrossSign = driver.findElement(By.cssSelector("img._8idr"));
		
		CrossSign.click();
		
//		3] Tag and attribute
		
		WebElement PassWord = driver.findElement(By.cssSelector("input[name='pass']"));
		
//		4] Tag Class and Attribute
		
		WebElement FbLogo =  driver.findElement(By.cssSelector("img.fb_logo[alt='Facebook']"));
		
		
		
		
		
		
	}
}
