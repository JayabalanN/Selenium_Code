package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Penta_Express {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://plxindia.com/admin");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin@@Express#");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//input[@id='Item1_billNo']")).sendKeys("0123");
		driver.findElement(By.name("Item1.from")).sendKeys("SALEM");
		driver.findElement(By.name("Item1.to")).sendKeys("D2C");
		
		
	}

}
