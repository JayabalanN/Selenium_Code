package com.mavenproject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@DataProvider
	private Object[][] test() {
		return new Object[][] {
			{"hackingphoenix007@gmail.com","hacking@007"},
			{"hackers@gmail.com","123titans@AOt"}
		};
	}
     public static WebDriver driver;
	@Test(dataProvider = "test")
	public void datas( String email,String pass) {
		System.setProperty("webdriver.chrome.driver", "D:\\Maven_WorkSpace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys(email,Keys.TAB,pass,Keys.ENTER);
	}
	@Test
	public void check() {
		String actual="https://www.facebook.com/";
		String expected= driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
	}


}