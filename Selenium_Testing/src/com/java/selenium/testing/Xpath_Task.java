package com.java.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("incognito");
		WebDriver driver=new ChromeDriver(ch);
		driver.get("http:\\www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]"));
		email.sendKeys("hackingphoenix@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("bubbly@sunshine");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.navigate().to("http:\\www.amazon.in");
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'NAPA HIDE Black Leather')]")).click();
	    driver.navigate().back();
		driver.close();

	}

}
