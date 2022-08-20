package com.java.selenium.testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[10]")).click();
		//-------------------Single_Frame--------------------------------------------------
		WebElement singleframe = driver.findElement(By.xpath("//*[@id=\"wrapframe\"]/iframe"));
		driver.switchTo().frame(singleframe);
		WebElement frameText = driver.findElement(By.id("Click"));
		frameText.click();
		System.out.println("Single Frame Text: "+frameText.getText());
		driver.switchTo().defaultContent();
		//---------------------Multiple_frame--------------------------------------------------
		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(parentFrame);
        driver.switchTo().frame("frame2");
        WebElement childFrame = driver.findElement(By.id("Click1"));
        childFrame.click();
        System.out.println("Multiple Frame Text: "+childFrame.getText());
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        //-----------------------Total_Frame_count--------------------------------------
        List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
        System.out.println("Total No.Of.Frame: "+totalframe.size());
        driver.close();
        
        
	}

}
