package DropBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook3 {
       public static void main (String [] args) throws InterruptedException {
    	   
    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
    	   WebDriver driver = new ChromeDriver();
    	   
    	   driver.get("https://www.facebook.com/");
    	   Thread.sleep(2000);
    	   
    	   WebElement CreatN = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
    	   CreatN.click();
    	   Thread.sleep(2000);
    	   
    	  WebElement BirthDay = driver.findElement(By.xpath("//select[@aria-label='Day']"));
    	  
    	  Select s = new Select(BirthDay);
    	  s.selectByIndex(6);
    	  
    	 List<WebElement> Day = s.getOptions();
    	 
    	 for(int i=0; i<Day.size(); i++) {
    		String text = Day.get(i).getText();
    		System.out.println(i+" "+text);
    	 }
    	  
    	  
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
       }

}
