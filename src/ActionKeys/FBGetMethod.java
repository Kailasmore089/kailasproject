package ActionKeys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBGetMethod {
	public static void main (String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
//		1] GetText();
		
		
		String actualText = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getText();
		String expectedText = "Sign Up";
		
		if(actualText.equals(expectedText)) {
			System.out.println("Test case pass For Sign Up Text Verification");
		}else {
			System.out.println("Test case failed for sign up Text Verification");
		}
		
		
//		(2)]
		
		String ActualText = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).getText();
		String Expected = "Create New Account";
		
		if(ActualText.equals(Expected)) {
			System.out.println("Test Case Pass For Create New Account  Verification");
		}else {
			System.out.println("Test Case Failed For Verification");
		}
		
		
//		3] getattribute ==> This Method will return value for required attribute
		
//		(1)
		 String Actual = driver.findElement(By.xpath("//a[text()='Watch']")).getAttribute("title");
		String Expected1 = "Browse our Watch videos.";
		
		if(Actual.equals(Expected1)) {
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test Case Failed");
		}
		
//		(2)
		
		String actual2 = driver.findElement(By.xpath("//a[text()='Facebook Lite']")).getAttribute("title");
		String Expected2 = "Facebook Lite for Android.";
		
		if(actual2.equals(Expected2)) {
			System.out.println("Test case pass For FB Lite");
		}else {
			System.out.println("Test case fail For FB Lite");
		}
		
		
//		 Multiple Elements ==> Locate all the elements one time ==> you have to extract each and every Element.
//		Customer Requirement
//		1] Collect all Footer Links and get links for it.
//		2] Collect all the Footer Links and get Count and Text out.
		
		List<WebElement> FooterLinks = driver.findElements(By.xpath("//ul[starts-with(@class,'uiList pageFooterLinkList')]/li/a"));
		System.out.println("Total Footer Links : "+FooterLinks.size());
		
		for(int i=0; i<FooterLinks.size(); i++) {
			String Links = FooterLinks.get(i).getAttribute("href");
			String text = FooterLinks.get(i).getText();
			System.out.println(i+" "+Links+" ==> "+text);
		}
		
		
		
		
	}

}
