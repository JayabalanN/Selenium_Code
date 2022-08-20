package com.java.selenium.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:\\www.amazon.in");//First_tab_(0th_index)
		driver.manage().window().maximize();
		Actions buliders=new Actions(driver);
		Robot robot=new Robot();
		//-----------------------------Second__tab_(1st_Index)-----------------------------------
		WebElement service = driver.findElement(By.xpath("//a[.='Customer Service']"));
		buliders.moveToElement(service).contextClick().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		//---------------------------------3Rd_tab_(2nd_Index)------------------------------------------
		WebElement eletronic = driver.findElement(By.xpath("//a[.=' Electronics ']"));
		buliders.moveToElement(eletronic).contextClick().perform();
		buliders.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		//----------------------4TH_Tab_(3rd_index)----------------------------------------
		WebElement today = driver.findElement(By.xpath("//a[.='Mobiles']"));
		buliders.moveToElement(today).contextClick().perform();
		buliders.keyDown(Keys.CONTROL);
		buliders.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		//----------------------------window_Handle------------------------------------------------------------
		String parentWindow= driver.getWindowHandle();
		System.out.println("Parent Window id : "+" "+parentWindow);
		System.out.println("Parent Window Title "+driver.getTitle());
		System.out.println("Parent Window url "+driver.getCurrentUrl());
		System.out.println("--------------------------------------------------");
		//-----------------------------Windows_Handles_for_each_loop------------------------------
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Index Position OF 0,1,2,3");
		for (String allwindow : windowHandles) {
			driver.switchTo().window(allwindow);
			System.out.println("allwindow url : "+" "+driver.getCurrentUrl());
			System.out.println("allwindow Title : "+" "+driver.getTitle());
			System.out.println("allwindow id : "+" "+allwindow);
			System.out.println("--------------------------------------------------");
		}
		System.out.println("Second Tab :"+" "+driver.getTitle());
		System.out.println("--------------------------------------------------");
		//---------------------Fixed_Set_To_List_Windows_handles_particular_position--------------------------------------------
		Set<String> multiHandles = driver.getWindowHandles();
		List<String> handles=new ArrayList<String> (multiHandles);
		driver.switchTo().window(handles.get(0));
		System.out.println("window Title : "+" "+driver.getTitle());
		System.out.println("--------------------------------------------------");
		Thread.sleep(4000);
	
		driver.switchTo().window(handles.get(2));
        System.out.println("Window title : "+" "+driver.getTitle());
		System.out.println("--------------------------------------------------");
		Thread.sleep(4000);
		driver.switchTo().window(handles.get(1));
		System.out.println(driver.getTitle());
		
		//---------------------------Close_child_tabs-------------------
		for (String closewindow : windowHandles) {
			if (!closewindow.equals(parentWindow)) {
				driver.switchTo().window(closewindow);
				driver.close();
				
			}
		} 

	}

}
