package com.java.selenium.testing;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//myuva//Downloads//chromedriver_win32 (2)//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http:\\www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("peaky blinders",Keys.ENTER);
		//--------------------Move_Hover&_Click-------------------------------------------------------------------------
		WebElement click = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		Actions bulider=new Actions(driver);
		bulider.moveToElement(click).click().perform();
		driver.navigate().back();
		Thread.sleep(2000);
		//-----------------------Double_click--------------------------------------------------------------------------
		driver.findElement(By.xpath("//*[@class='fc9yUc tNxQIb ynAwRc OSrXXb']")).click();
		WebElement doubleclick = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
		doubleclick.click();
		bulider.doubleClick().build().perform();
		Thread.sleep(5000);
		bulider.sendKeys(Keys.ESCAPE).build().perform();
		driver.navigate().back();
		Thread.sleep(2000);
		//----------------------Sendkeys_use_context_option_Menu_operate-------------------------------------------------------
	    WebElement rightClick = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		bulider.moveToElement(rightClick).contextClick().perform();
		bulider.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		//-----------------------Robot_class_use_Context_click_Menu-------------------------------------------------------------
		WebElement robotClick = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		bulider.moveToElement(robotClick).contextClick().perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}}
	


