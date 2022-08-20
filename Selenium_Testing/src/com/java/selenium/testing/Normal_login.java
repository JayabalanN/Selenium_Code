package com.java.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("http:\\www.google.com");
      driver.manage().window().maximize();
      driver.findElement(By.name("q")).sendKeys("peaky blinder",Keys.ENTER);
      WebElement findElement = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
      findElement.click();
	}

}
