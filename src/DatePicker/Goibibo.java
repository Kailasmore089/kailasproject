package DatePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Goibibo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ssl);
		
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement calender = driver.findElement(By.xpath("//span[@class='sc-kfPuZi dprjVP fswDownArrow']"));
		calender.click();
		
		String date = "10";
		String month = "August";
		String year = "2022";
		
		
		
		while(true) {
			String mn = driver.findElement(By.xpath("//div[@class='DayPicker-Caption' and @role='heading']")).getText();
//			System.out.println(mn);
			
			String[] arr=mn.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) {
				break;
			}else {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
			
		}
		
//		date
		
		List<WebElement> alldate = driver.findElements(By.xpath("//div[@class='DayPicker-Body']/div/div"));
		
		for(WebElement ale:alldate) {
			String value = ale.getText();
			if(value.equalsIgnoreCase(date)) {
				ale.click();
				break;
			}
		}
		
		WebElement donebtn = driver.findElement(By.xpath("//span[text()='Done']"));
		donebtn.click();
		
		WebElement adultplusbtn = driver.findElement(By.xpath("(//div[@class='sc-ehCJOs kXqgMf']/div/span)[3]"));
		adultplusbtn.click();
		adultplusbtn.click();
		
		WebElement childrenplus = driver.findElement(By.xpath("(//div[@class='sc-ehCJOs kXqgMf']/div/span)[6]"));
		childrenplus.click();
		
		WebElement infants = driver.findElement(By.xpath("(//div[@class='sc-ehCJOs kXqgMf']/div/span)[9]"));
		infants.click();
		
		driver.findElement(By.xpath("//a[text()='Done']")).click();
		
		
		
//		driver.quit();
		
		
		
		
		
		
	}

}
