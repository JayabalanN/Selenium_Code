package mavenproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_Adactin {
     public static WebDriver driver;
     public static WebDriver browserLaunch(String type) {
    	 if (type.equalsIgnoreCase("chrome")) {
    		 System.setProperty("webdriver.chrome.driver", "D:\\Maven_WorkSpace\\chromedriver_win32\\chromedrivere.exe");
    		 driver=new ChromeDriver();
			}
    	 if (type.equalsIgnoreCase("firefox")) {
    		 System.setProperty("webdriver.gecko.driver", "D:\\Maven_WorkSpace\\GeckoDriver\\geckodriver.exe");
    		 driver=new FirefoxDriver();
			
		}return driver;
     }
     
    public static void sleeping (long ms) throws InterruptedException {
    	Thread.sleep(ms);
    }
    public static void clickonElement(WebElement element) {
    	element.click();
    }
    public static void getrl(String name) {
    	driver.get(name);
    	driver.manage().window().maximize();
    }
    public static void closeingWindow() {
    	driver.close();
    }
    public static void inputText(WebElement element,String name)
    {
    	element.sendKeys(name);
    }
    public static void timeoutImplicitWait(int w) {
    	driver.manage().timeouts().implicitlyWait(w,TimeUnit.SECONDS);
    	
    }
    public static void takesScreenshots(String pathname) throws IOException {
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
    	File destinations=new File(pathname);
    	FileHandler.copy(screenshotAs, destinations);
    	
    }
     
    public static void dropDown(WebElement element,String type,String value) {
    	Select s=new Select(element);
    	if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		}
    	if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);
		}
    }
     
     
     
     
     
     
     
     
     
     
     
}
