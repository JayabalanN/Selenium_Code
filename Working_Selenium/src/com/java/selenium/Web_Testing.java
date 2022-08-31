package com.java.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web_Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		System.setProperty("webdriver.chrome.driver", "C://Users//myuva//Downloads//chromedriver_win32 (2)//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("sharktank australian",Keys.ENTER);

	}

}
