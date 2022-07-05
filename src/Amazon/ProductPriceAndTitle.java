package Amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPriceAndTitle {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(103)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/deal/cddb7b76?showVariations=true&ref=dlx_deals_gd_dcl_img_8_cddb7b76_dt_sl15_36");
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> titles = driver.findElements(By.xpath("//ul[starts-with(@class,'a-unordered-list')]/li/span/div/div/a"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[@id='octopus-dlp-asin-stream']/ul/li/span/div/div/child::div[4]/span/span/child::span[2]"));
		List<WebElement> ActualPrices = driver.findElements(By.xpath("//ul[starts-with(@class,'a-unordered-list')]/li/span/div/div/child::div[4]/child::span[2]/child::span[2]"));
		
		
		for(int i=0; i<titles.size(); i++) {
			for(int j=i; j<=i; j++) {
				for(int k=i; k<=i; k++) {
					WebElement title = titles.get(i);
					String text = title.getAttribute("title");
					WebElement price = prices.get(j);
					String rs = price.getText();
					WebElement ActualPrice = ActualPrices.get(k);
					String Actualp = ActualPrice.getText();
					System.out.print("Actual Price==>" + Actualp + "==>" + "DiscountPrice ==>" + rs + "==>" + text);
				}
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
