package DatePicker;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		
		
		String year = "2022";
		String month = "July";
		String date = "10";
		
//		Open date picker
		WebElement calender = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		calender.click();
		
		while(true) {
			String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
		String arr[] =monthyear.split(" ");
		String mon = arr[0];
		String yr = arr[1];
		
		if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//td[@class='next']/button")).click();
		}
			
		}
		
//		date
		 List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		 for(WebElement ele:alldates) {
			 String dt=ele.getText();
			 if(dt.equals(date)) {
				 ele.click();
				 break;
			 }
		 }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
