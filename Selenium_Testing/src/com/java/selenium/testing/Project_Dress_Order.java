package com.java.selenium.testing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project_Dress_Order {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions bulider=new Actions(driver);
		driver.get("http:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("automationpractices.com",Keys.ENTER);
		driver.findElement(By.xpath("//h3[.='Automation Practice']")).click();
		WebElement signin = driver.findElement(By.className("login"));
		bulider.moveToElement(signin).click().perform();
		//       WebElement cEmail = driver.findElement(By.xpath("//input[@id='email_create']"));
		//       cEmail.sendKeys("hackingphoenix007@gmail.com");
		//       driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
		//       Thread.sleep(3000);
		//       driver.findElement(By.xpath("//input[@name='id_gender']")).click();
		//       driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("jay");
		//       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("N");
		//       driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("porur,chennai-600116");
		//       driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
		//       WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		//       Select dropstate=new Select(state);
		//       dropstate.selectByValue("30");
		//       driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("00000");
		//       driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys("Mathivanan Is A Hero");
		//       driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("8489792555");
		//       WebElement add = driver.findElement(By.xpath("//input[@name='alias']"));
		//       add.clear();
		//       add.sendKeys("porur-newyork");
		//       driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
		//       driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Rock");
		//       driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("hacking@007");
		//       WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		//       Select days=new Select(day);
		//       days.selectByValue("19");
		//       WebElement month = driver.findElement(By.id("months"));
		//       Select months=new Select(month);
		//       months.selectByValue("7");
		//       WebElement year = driver.findElement(By.id("years"));
		//       Select years=new Select(year);
		//       years.selectByValue("1998");
		//       driver.findElement(By.id("newsletter")).click();
		//       driver.findElement(By.id("optin")).click();
		//       driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		driver.findElement(By.id("email")).sendKeys("hackingphoenix007@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("hacking@007");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		Thread.sleep(3000);
		WebElement dress = driver.findElement(By.xpath("(//a[.='Dresses'])[2]"));
		bulider.moveToElement(dress).click().perform();
		WebElement drezz = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[3]"));
		bulider.moveToElement(drezz).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li[2]/div/div[2]/div[2]/a[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
		WebElement dropSelect = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
		Select ds=new Select(dropSelect);
		ds.selectByValue("2");
		driver.findElement(By.xpath("//a[@id='color_24']")).click();
		Thread.sleep(3000); 
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        bulider.moveToElement(cart).click().perform();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Good Think Makeit Perfact");
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
        Thread.sleep(5000);
        TakesScreenshot ts=(TakesScreenshot) driver;
          File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
          File takes=new File("D:\\Selenium_Workspace\\Selenium_Project\\Selenium_Testing\\Screenshots\\img.png");
          FileUtils.copyFile(screenshotAs, takes);


	}

}
