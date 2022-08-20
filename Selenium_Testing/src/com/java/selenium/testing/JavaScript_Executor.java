package com.java.selenium.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript_Executor {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("incognito");
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		 driver.get("https://www.netflix.com/in/title/80057918");
		 //------------------Scroll_some_positin---------------------------------------------------
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scroll(0,300)", "");
		 Thread.sleep(5000);
		 js.executeScript("window.scroll(0,-300)", "");
		 //-------------------Go_to_Bottom_page----------------------------------------------------
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		 Thread.sleep(5000);
		 js.executeScript("window.scroll(0,0)", "");
         //----------------WebElement_positin------------------------------------------------------
		 WebElement jsExecutor = driver.findElement(By.xpath("//a[.='Crime TV Shows']"));
		 js.executeScript("arguments[0].scrollIntoView()", jsExecutor);
		 Thread.sleep(5000);
		 js.executeScript("window.scroll(0,0)","");
		 //-------------------Robot_class---------------------------------------------------------
		  Robot robot= new Robot();
		  robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		  robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		  Thread.sleep(4000);
		  robot.keyPress(KeyEvent.VK_PAGE_UP);
		  robot.keyPress(KeyEvent.VK_PAGE_UP);
		  driver.close();
		  
		  }

}
