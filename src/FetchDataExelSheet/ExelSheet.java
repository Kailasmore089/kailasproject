package FetchDataExelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		/*1] configure the apache poi jar file to your project.
		 *2] create the excel sheet with some data.
		 *3] create the object of fileinputstream ==> to identify which file you have to handle by providing path of that file.
		 *4] to open the excel sheet we have to call create static method which is available in WorkbookFactory class.
		 *5] call getsheet method to jump on perticular sheet.
		 *6] call getrow method to jump on particular row.
		 *7] call getcell method to jump on any cell means column.
		 *8] To read the data ==> get string cell value 
		 *                    ==> get numeric cell value
		*/
	
//		Fetching String Value.
		
		FileInputStream km = new FileInputStream("C:\\Users\\kailas\\Desktop\\Kailas.xlsx");
		String value = WorkbookFactory.create(km).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Desktop\\Selenium All Jars\\chromedriver_win32(100)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Searchbox.sendKeys(value);
		
		
		
		
	
	}

}
