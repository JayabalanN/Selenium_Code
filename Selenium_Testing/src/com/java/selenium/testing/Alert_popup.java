package com.java.selenium.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//myuva//Downloads//chromedriver_win32 (2)//chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("Demo AutomationTesting Alert",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div[1]/div/div/div[1]/div/a")).click();
		//Normal Alert
        driver.findElement(By.xpath("(//button[contains(@class,'btn ')])[2]")).click();
        Alert normalAlert = driver.switchTo().alert();
        System.out.println("Normal Alert Text: "+normalAlert.getText());
        normalAlert.accept();
        //Confirm Alert
        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();
        Alert confirmBox = driver.switchTo().alert();
        System.out.println("confirm Alert Text: "+confirmBox.getText());
        confirmBox.dismiss();
        //prompt Box
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'btn-info')]")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert box: "+promptAlert.getText());
        promptAlert.sendKeys(" Jay");
        promptAlert.accept();
        //prompt sendtext
        System.out.println("Prompt Alert Sendtext: "+driver.findElement(By.id("demo1")).getText());
        driver.close();
        
        
	}

}
