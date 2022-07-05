package JavaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W3School {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ssl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		1] Drawing Border Around Element
		
//		driver.switchTo().frame("iframeResult");
//		 WebElement TryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//		 
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//	    js.executeScript("arguments[0].style.border='2px solid red'", TryitBtn);
//		SeleniumUtils.borderbyjs(driver, TryitBtn);
		
//		2] Capturing the Title of Page
		
		/* driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String Title = js.executeScript("return document.title").toString();
		System.out.println(Title);
		*/
		
//		3] Clicking on Webelement
		
	/*	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.switchTo().frame("iframeResult");
		 WebElement TryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
		 
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].click();", TryitBtn);
		 
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		
		*/
		
//		4] Create alert
		
	  /*   driver.get("https://wwww.facebook.com/");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('" + "The facebook Site is launched" + "')");
		
		  Alert alert = driver.switchTo().alert();
		  alert.accept();

         */
		
//		5] Refreshing th page
		
	/*	driver.get("https://wwww.facebook.com/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  JavascriptExecutor js = ((JavascriptExecutor)driver);
		  js.executeScript("history.go(0)");
		  
		*/ 

//		6] Scrolling ==> Scroll up/down/scroll 
         
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SeleniumUtils.Scrollbyjs(driver,0,6000);
		
//		Scroll Down
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,5000)");
//		Scroll Up
//		js.executeScript("scroll(0,2000)");
		
//		Scroll Into View
		
//		WebElement Desclaimerbtn = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].scrollIntoView(true)",Desclaimerbtn);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
