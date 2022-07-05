package DropBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaffSelection {

	public static void main (String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ssc.nic.in/");
		Thread.sleep(2000);
		
		WebElement Signupbtn = driver.findElement(By.xpath("//a[text()='New User ? Register Now']"));
		Signupbtn.click();
		Thread.sleep(2000);
		
		WebElement TypeID = driver.findElement(By.xpath("//select[@name='TypeofID']"));
		Select s = new Select(TypeID);
		
		s.selectByVisibleText("PAN Card");
		
	    List<WebElement> ID = s.getOptions();
	    for(int i=0; i<ID.size(); i++) {
	    	String text = ID.get(i).getText();
	    	System.out.println(i+" "+text);
	    }
		
		
	    System.out.println("=========================================================================");
	    
	    
	    WebElement Eduid = driver.findElement(By.xpath("//select[@id='EducationBoard']"));
	    Select s1 = new Select(Eduid);
	    
	    s1.selectByVisibleText("Maharashtra State Board of Secondary And Higher Secondary Education");
	    
	    List<WebElement> eduid = s1.getOptions();
	    
	    for(int i=0; i<eduid.size(); i++) {
	    	String text1 = eduid.get(i).getText();
	    	System.out.println(i+" "+text1);
	    }
	    
		WebElement verify = driver.findElement(By.xpath("//select[@id='ddlEducationBoard']"));
		
		Select s2 = new Select(verify);
		s2.selectByVisibleText("Maharashtra State Board of Secondary And Higher Secondary Education");
		
		List<WebElement> Verify = s2.getOptions();
		
		for(int i=0; i<Verify.size(); i++) {
			String text3 = Verify.get(i).getText();
			System.out.println(i+" "+text3);
		}
		
		
		
		WebElement YearPassing = driver.findElement(By.xpath("//select[@id='Yearofpassing']"));
		Select s3 = new Select(YearPassing);
		
		List<WebElement> PassingYear = s3.getOptions();
		
		for(int i=0; i<PassingYear.size(); i++) {
			String text4 = PassingYear.get(i).getText();
			System.out.println(i+" "+text4);
			
		}
		
		
		
		
		
		
		
		
	}
}
