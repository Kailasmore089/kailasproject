package DropBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(103)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement CreatNewAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreatNewAcc.click();
		Thread.sleep(2000);
//		
//		WebElement Birthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		
//		Select s = new Select(Birthday);
//		
//		s.selectByValue("28");
		
//		s.selectByIndex(27);
		
//		s.selectByVisibleText("28");
		
//		 List<WebElement> Day = s.getOptions();
//		 
//		 for(int i=0; i<Day.size(); i++) {
//			String text = Day.get(i).getText();
//			System.out.println(i+" "+text);
//		 }
		
		
//		 WebElement BirthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//		 
//		 Select s = new Select(BirthMonth);
		 
//		 s.selectByValue("6");
//		 s.selectByIndex(5);
		
		WebElement BirthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s = new Select(BirthYear);
		
		s.selectByValue("2018");
		s.selectByIndex(5);
		s.selectByVisibleText("2002");
		
		 List<WebElement> Year = s.getOptions();
//		
//		 for(int i=0; i<Year.size(); i++) {
//			String Years = Year.get(i).getText();
//			System.out.println(i+" "+Years);
//			 
//		 }
//		 Advanced For Loop
		 int j=0;
		 for(WebElement years : Year) {
			 System.out.println(j+" "+ years.getText());
			 j++;
		 }
		
		
		
		
		
//		
//		WebElement Birthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		 WebElement BirthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//		 WebElement BirthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		 
//		 Select s = new Select(Birthday);
//		 s.selectByVisibleText("22");
//		 
//		 Select s1 = new Select(BirthMonth);
//		 s1.selectByVisibleText("Dec");
//		 
//		 Select s2 = new Select(BirthYear);
//		 s2.selectByVisibleText("1999");
//		
		
		
//		 WebElement BirthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//		 Select s = new Select (BirthMonth);
//		  String Firstopt = s.getFirstSelectedOption().getText();
		 
//		 System.out.println(Firstopt);
		 
		
	
		
	}

}
