package ActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		
        ChromeOptions ssl = new ChromeOptions();
        ssl.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(ssl);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
//		1] Hovering action on Elements
//		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='desktop-navLink']/a"));
		
		for(int i=0; i<links.size(); i++) {
			WebElement link = links.get(i);
			Actions action = new Actions(driver);
			action.moveToElement(link);
			action.build().perform();
			System.out.print(i+"]"+link.getText()+"==>");
			System.out.println(link.getAttribute("href"));
			Thread.sleep(1000);
			
		}
//		WebElement element = driver.findElement(By.xpath("//a[@data-group='home-&-living']"));
//        Actions action = new Actions(driver);
//        action.moveToElement(element);
//		action.click().build().perform();
		
//		2] Handeling Resizable Element
		
//		driver.get("https://jqueryui.com/resizable/");
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		
//		driver.switchTo().frame(frame);
//		
//		WebElement box = driver.findElement(By.xpath("//div[contains(@class,'resizable-handle ui-resizable-se ui-icon')]"));
//		
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(box, 150, 50);
//		action.build().perform();
		
		
//		3] Drag and drop element
		
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		
//		WebElement draggble = driver.findElement(By.xpath("//div[@id='draggable']"));
//		
//		 WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
//		 
//		 Actions action = new Actions(driver);
//		 action.dragAndDrop(draggble, droppable);
//		 action.build().perform();
//		
		
//		4] Draggable
//		
//		driver.get("https://jqueryui.com/draggable/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		
//		driver.switchTo().frame(frame);
//		
//		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		Thread.sleep(2000);
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(draggable, 50, 50);
//		action.build().perform();
		
		
		
//		5] Right Click
		
//		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebElement img = driver.findElement(By.xpath("//img[@onclick='return dm_popup(1, 2000, event);']"));
//		
//		Actions action = new Actions(driver);
//		action.contextClick(img);
//		action.build().perform();
		
//		6] SendKeys using Action class
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
//		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		
//		Actions action = new Actions(driver);
//		action.sendKeys(Username, "Kailas123");
//		action.sendKeys(Password, "1223455");
//		action.build().perform();
		
		//action.keyDown(Username, Keys.SHIFT).sendKeys("paresh").keyUp(Keys.SHIFT).build().perform();
//		Not Supported
		
		
		
		
		
		
		
	}

}
