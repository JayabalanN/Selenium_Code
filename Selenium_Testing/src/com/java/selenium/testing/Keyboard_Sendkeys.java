package com.java.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Sendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
       ChromeOptions s=new ChromeOptions();
       s.addArguments("incognito");
       WebDriver driver=new ChromeDriver(s);
       driver.get("http:\\www.google.com");
       driver.manage().window().maximize();
       WebElement findElement = driver.findElement(By.name("q"));
      findElement.sendKeys("peaky blinders");
      Thread.sleep(5000);
       Actions builder=new Actions(driver);
       builder.keyDown(Keys.CONTROL).sendKeys(Keys.DOWN).sendKeys(Keys.ARROW_DOWN).perform();;
       
       
		
		
		
		
		
	}

}
