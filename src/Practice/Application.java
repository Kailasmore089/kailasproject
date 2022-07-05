package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Application {
	public static void main (String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
//		String Logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).getText();
//		System.out.println(Logo);
		
//		System.out.println("Statust os FaceBook Logo "+Logo.isDisplayed());
//		System.out.println("Facebook LOgo is Enalbled "+Logo.isEnabled());
//		 String Fblogo = Logo.getText();
//		 System.out.println(Fblogo);
		
//		 WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
//		 
//		 System.out.println("Username field is enabled "+Username.isEnabled());
//		
//		WebElement Heading = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
//		 String subheading = Heading.getText();
//		 System.out.println(subheading);
		
	WebElement creatbtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	creatbtn.click();
	Thread.sleep(10000);
	
	WebElement Birthmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	Select s = new Select (Birthmonth);
        List<WebElement> month = s.getOptions();
        for(int i=0; i<month.size(); i++) {
        	 String text1 = month.get(i).getText();
        	 System.out.println(i+" "+text1);
			
		 }
		
		
		
		
		
		
		
		
	}

}
