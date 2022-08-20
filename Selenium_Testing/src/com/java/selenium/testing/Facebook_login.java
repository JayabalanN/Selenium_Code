package com.java.selenium.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//myuva//Downloads//chromedriver_win32 (2)//chromedriver.exe");
		//ChromeOptions ch=new ChromeOptions();
		//ch.addArguments("incognito");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.facebook.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("hackingphoenix007@gmail.com");
		String sendid = id.getAttribute("value");
		System.out.println("Send Id: "+sendid);
		
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("hacking@007");
        String sendpass = pass.getAttribute("value");
        System.out.println("Sending Pass: "+sendpass);
        
        
        driver.findElement(By.name("login")).click();
        
	}

}
