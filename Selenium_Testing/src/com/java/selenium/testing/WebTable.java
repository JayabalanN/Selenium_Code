package com.java.selenium.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[8]")).click();
		List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement total : table) {
			System.out.println(total.getText());
		}
		
		List<WebElement> countrow =driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr"));
		System.out.println("No Of row"+countrow.size());
		
		List<WebElement> countRow = driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr/td"));
		System.out.println("No Of Row"+countRow.size());



	}

}
