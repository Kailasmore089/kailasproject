package ActionKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main (String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
//		driver.manage().window().maximize();
		
//		2] sendkeys Method and isEnabled
		
		WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		if(Username.isEnabled()==true) {
			Username.sendKeys("Kailas1999@gmail.com");
		}else {
			System.out.println("Username Field is Disabled");
		}
		
		
		WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		if(Password.isEnabled()==false) {
			System.out.println("Passward field Disabled");
		}
		
		Password.sendKeys("Rahul");
		
		
//		2] click() Method
 		
		WebElement Createaccountbtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		if(Createaccountbtn.isEnabled()==false) {
			System.out.println("Create btn field is Disabled");
		}
		Createaccountbtn.click();
		Thread.sleep(2000);
		
//		WebElement femalebtn = driver.findElement(By.xpath("//input[@value='1']"));
//		femalebtn.click();
		
//		3] isEnabled() ==> To check element whether enabled or disabled
		
		WebElement Custombtn = driver.findElement(By.xpath("//input[@value='-1']"));
		Custombtn.click();
		
		WebElement select = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
		select.click();
		
//		WebElement SelectPronoun = driver.findElement(By.xpath("//option[text()='Select your pronoun']"));
//		if(SelectPronoun.isEnabled()==false) {
//			System.out.println("SelectPronoun field is disabled");
//		}
		
		
		WebElement select1 = driver.findElement(By.xpath("//option[text()='She: \"Wish her a happy birthday!\"']")); 
		if(select1.isEnabled()==true) {
//			System.out.println("Field is Enabled");
			select1.click();
		}else {
			System.out.println("Field is Disabled");
		}
		
		WebElement CustomGender = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		if(CustomGender.isEnabled()==true) {
			CustomGender.sendKeys("Male");
		}else {
			System.out.println("field is disabled");
		}
		
		WebElement closecreateaccount = driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']"));
		closecreateaccount.click();
		
//		4] isDisplayed ==> This method is used for element is Displayed or Not in case of images
		
		WebElement FbLogo = driver.findElement(By.xpath("//img[starts-with(@class,'fb_logo ')]"));
		if(FbLogo.isDisplayed()==true) {
			System.out.println("Facebook Logo is Displayed");
		}else {
			System.out.println("Facebook Logo is Not Displayed");
		}
		
		WebElement FbTagline = driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook helps you connect')]"));
		if(FbTagline.isDisplayed()==true) {
			System.out.println("Fb Tag Line is Displayed");
		}else {
			System.out.println("Not Displayed");
		}
		
//		5] isSelected ==> Boolean Result ==> for CheckBox/Radio Btn
		
		WebElement Createaccountbtn1 = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Createaccountbtn1.click();
		
		Thread.sleep(2000);
		
		WebElement Femalebtn = driver.findElement(By.xpath("//input[@value='1']"));
		System.out.println("Status of Female btn "+Femalebtn.isSelected());
		
		
	}

}
