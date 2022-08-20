package com.java.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_Type {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http:\\www.flipkart.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("(/html/body/div/div/div[2]/div/div[1]/div/a/div[2])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='_6WQwDJ'])[2]//preceding::a[@class='_6WQwDJ']")).click();
		driver.navigate().back();
	    Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@id='container']/div/div[2]/div/div/span)[2]")).click();




  
	}

}
