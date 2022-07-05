package CustomizedXpathAndCssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(99)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
//		Basic Xpath
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		
		searchbox.sendKeys("Ifalcall Tv");
		
//		Xpath by or Logical Operator
		
		 WebElement searchbutton = driver.findElement(By.xpath("//button[@class='L0Z3Pu' or @type='submit']"));
		
		searchbutton.click();
		
//		Xpath by Text()
		
		WebElement Login =  driver.findElement(By.xpath("//a[text()='Login']"));
		
		Login.click();
		
//		Xpath with Contains
		
		WebElement SearchBox =  driver.findElement(By.xpath("//input[contains(@title,'products, brands')]"));
		
		SearchBox.click();
		
//		XPath by Start-with
		
		WebElement Searchbox =  driver.findElement(By.xpath("//input[starts-with(@title,'Search for')]"));
		Searchbox.click();
		
		
//		CSS Selectors
		
//		1] Tag and id
		
//		NA
		
//		2] Tag and Class
		
//		NA
		
//		3] Tag and Attribute
		
		WebElement SearchBox1 = driver.findElement(By.cssSelector("input[title='Search for products, brands and more']"));
		SearchBox1.sendKeys("Realme 8s 5g");
		
		WebElement MoreDropDown = driver.findElement(By.cssSelector("svg.zZ3yfL"));
		MoreDropDown.click();
		
//		4] Tag Class and Attribute
		
		WebElement CartDropdown = driver.findElement(By.cssSelector("a._3SkBxJ[href='/viewcart?otracker=Cart_Icon_Click']"));
		CartDropdown.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
