package com.java.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.get("http:\\www.facebook.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Hacking");
		driver.findElement(By.name("lastname")).sendKeys("Phoenix");
		WebElement day = driver.findElement(By.id("day"));
		Select drop=new Select(day);
		drop.selectByIndex(18);
		WebElement month = driver.findElement(By.id("month"));
		Select drop2=new Select(month);
		drop2.selectByVisibleText("Jul");
		WebElement year = driver.findElement(By.id("year"));
		Select drop3=new Select(year);
		drop3.selectByValue("1998");
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		System.out.println(gender.isSelected());
		gender.click();
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("hackingphoenix007@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hackingphoenix007@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("hacking@007");
		driver.findElement(By.name("websubmit")).click();
		driver.close();
		
		

	}

}
