package com.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browser_Launch {
	public WebDriver driver;
	String driverPath="D:\\Maven_WorkSpace\\chromedriver_win32\\chromedriver.exe";
	String browser="webdriver.chrome.driver";
	String baseUrl="https://www.google.com";
	   @BeforeTest
        public void launch() {
	   System.setProperty(browser,driverPath);
	   driver=new ChromeDriver();
	   driver.get(baseUrl);
   }
	   @Test
	   public void homePageVerify() {
		   System.out.println(driver.getTitle());
	   }
	   @AfterTest
	   public void endSession() {
		   driver.quit();
	   }
	   
}
