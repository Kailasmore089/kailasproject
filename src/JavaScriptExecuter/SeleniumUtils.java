package JavaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils {
	
//	   1] Creating Border Around WebElement.
	
	public static void borderbyjs(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='4px solid red'", element);
	}

	
//	   2] Capturing  Title of Page 
	    
	    public static String titlebyjs(WebDriver driver) {
	    JavascriptExecutor js = ((JavascriptExecutor)driver);
	   String Title = js.executeScript("return document.title").toString();
	   return Title;
	    }
	    
//	    3] Clicking On webelement
	    
	    public static void Clickbyjs(WebDriver driver, WebElement element) {
	    	JavascriptExecutor js = ((JavascriptExecutor)driver);
	    	js.executeScript("arguments[0].click();",element);
	    }
	
	    
//	    4] Generating Run Time Alert with info
	    
	    public static void alertbyjs(WebDriver driver, String message) {
	    	JavascriptExecutor js = ((JavascriptExecutor)driver);
	    	js.executeScript("alert('"+message+"')");
	    	
	    }
	
	    
//	    5] Refreshing The Page 
	    
	    public static void refreshbyjs(WebDriver driver ) {
	    	JavascriptExecutor js = ((JavascriptExecutor)driver);
	    	js.executeScript("history.go(0)");
	    }
	    
//	    6] Scrolling up and Down
	    
	    public static void Scrollbyjs(WebDriver driver, int x,int y){
	    	JavascriptExecutor js = ((JavascriptExecutor)driver);
	    	js.executeScript("scroll("+x+","+y+")");
	    }
	    
	
	

}	
	
	
	
	
	
	

