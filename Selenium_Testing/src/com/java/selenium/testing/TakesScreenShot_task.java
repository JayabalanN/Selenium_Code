package com.java.selenium.testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakesScreenShot_task {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.get("http:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("peaky blinders"+Keys.ENTER);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[6]/div/div/g-section-with-header/div[1]/div/div/div[1]/g-link/a")).click(); 
         /*TakesScreenshot ts=(TakesScreenshot) driver;
         File source=ts.getScreenshotAs(OutputType.FILE);
         File des=new File("D:\\Selenium_Workspace\\Selenium_Project\\Selenium_Testing\\Screenshots\\img.png");
         FileUtils.copyFile(source, des);
         Thread.sleep(3000);*/
         //driver.close();
		Thread.sleep(3000);
         WebElement ele = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[2]/div/div[2]/div/a"));
         File soruce1=ele.getScreenshotAs(OutputType.FILE);
         File des1=new File("D:\\Selenium_Workspace\\Selenium_Project\\Selenium_Testing\\Screenshots\\img1.png");
         FileUtils.copyFile(soruce1, des1);
	     
        WebElement section = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div/div/div/div/span/span"));
        File sor=section.getScreenshotAs(OutputType.FILE);
        File dele=new File("D:\\Selenium_Workspace\\Selenium_Project\\Selenium_Testing\\Screenshots\\img2.png");
        FileUtils.copyFile(sor, dele);
        driver.close();
	
	
	
	}

}
