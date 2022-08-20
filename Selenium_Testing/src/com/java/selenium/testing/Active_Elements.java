package com.java.selenium.testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Active_Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//myuva//Downloads//chromedriver_win32 (2)//chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("incognito");
		WebDriver driver=new ChromeDriver(ch);
		Thread.sleep(5000);
		driver.get("http:\\www.facebook.com");
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("hackingphoenix007@gmail.com",Keys.TAB,"hacking@007");
		activeElement.submit();
		driver.close();
	}

}
