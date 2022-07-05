package LocatorsElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
     public static void main (String [] args) {
    	 
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(99)\\chromedriver.exe" );
    	 
    	 WebDriver driver  = new ChromeDriver();
    	 
    	 driver.get("https://www.flipkart.com/");
    	 
    	 driver.manage().window().maximize();
    	 
    	 
//    	 By Class Name
    	 driver.findElement(By.className("_3704LK"));
    	 
    	 driver.findElement(By.className("L0Z3Pu"));
    	 
    	 driver.findElement(By.className("Login"));
    	 
//    	  By linked Test
    	 
    	 driver.findElement(By.linkText("Cart"));
    	 
    	 driver.findElement(By.linkText("Login"));
    	 
    	 driver.findElement(By.linkText("Top Offers"));
    	 
    	 driver.findElement(By.linkText("Request OTP"));
    	 
    	 driver.findElement(By.linkText("Login"));
    
//    	 By Partial linked Test
    	 
    	 driver.findElement(By.partialLinkText("Create an account"));
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }

}
