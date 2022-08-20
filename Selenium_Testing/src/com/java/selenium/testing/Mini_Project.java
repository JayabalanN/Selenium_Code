package com.java.selenium.testing;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//myuva//Downloads//chromedriver_win32 (2)//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Actions bulider=new Actions(driver);
		/* WebElement newuser = driver.findElement(By.xpath("//a[.='New User Register Here']"));
         bulider.moveToElement(newuser).click().perform();
         driver.findElement(By.name("username")).sendKeys("Jayabalan");
         driver.findElement(By.id("password")).sendKeys("hacking@007");
         driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys("hacking@007");
         driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("bala");
         driver.findElement(By.xpath("//input[@id='email_add']")).sendKeys("hackingphoenix007@gmail.com");
         driver.findElement(By.xpath("//input[@id='tnc_box']")).click();*/
		//-----------------------------Login_Page-------------------------------------------------
		WebElement logName = driver.findElement(By.id("username"));
		logName.sendKeys("JayaBalanN");
		WebElement logPass = driver.findElement(By.id("password"));
		logPass.sendKeys("hacking@007");
		WebElement clickButton = driver.findElement(By.id("login"));
		bulider.moveToElement(clickButton).click().perform();
		//------------------------------Search_Hotel_Page---------------------------------------------------------------
		WebElement location = driver.findElement(By.id("location"));
		Select locator=new Select(location);
		locator.selectByVisibleText("Los Angeles");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select hotels=new Select(hotel);
		hotels.selectByValue("Hotel Sunshine");
		WebElement rType = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select roomType=new Select(rType);
		roomType.selectByVisibleText("Super Deluxe");
		WebElement hmr = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select hmRoom=new Select(hmr);
		hmRoom.selectByValue("4");
		WebElement checkInDate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		checkInDate.clear();
		checkInDate.sendKeys("01/02/2021");
		WebElement checkOutDate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		checkOutDate.clear();
		checkOutDate.sendKeys("05/02/2021");
		WebElement adultPerRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select room=new Select(adultPerRoom);
		room.selectByValue("2");
		WebElement click = driver.findElement(By.id("Submit"));
		bulider.moveToElement(click).click().perform();
		Thread.sleep(3000);
		//---------------Select_Hotel-----------------------------------------------------------------
		WebElement selectHotel = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		selectHotel.click();
		WebElement continues = driver.findElement(By.id("continue"));
		bulider.moveToElement(continues).click().perform();
		Thread.sleep(3000);
		//-----------------------------Book_A_Hotel-------------------------------------------
		WebElement nameFirst = driver.findElement(By.xpath("//input[@id='first_name']"));
		nameFirst.sendKeys("Jayabalan");
		WebElement nameLast = driver.findElement(By.xpath("//input[@id='last_name']"));
		nameLast.sendKeys("N");
		WebElement billingAddress = driver.findElement(By.xpath("//textarea[@id='address']"));
		billingAddress.sendKeys("porur-chennai");
		WebElement cardMelaEruka16NoSollu = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cardMelaEruka16NoSollu.sendKeys("0000000000000000");
		WebElement selectCard = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select card=new Select(selectCard);
		card.selectByVisibleText("VISA");
		WebElement expMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select months=new Select(expMonth);
		months.selectByValue("7");
		WebElement expYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select years=new Select(expYear);
		years.selectByValue("2022");
		WebElement cvvno = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvvno.sendKeys("0000");
		WebElement bookNow = driver.findElement(By.xpath("//input[@id='book_now']"));
		bulider.moveToElement(bookNow).click().perform();
		//--------------------------------My_ltinerary----------------------------------------
		WebElement bookingStatus = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		bookingStatus.click();
		//------------------------------Takes_Screenshot-----------------------------------------
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\Selenium_Workspace\\Selenium_Project\\Selenium_Testing\\Screenshots\\img3.png");
		FileHandler.copy(screenshotAs, des);
		//--------------------cancel_Booking------------------------------------------------------
		WebElement cancelBook = driver.findElement(By.xpath("//input[@id='btn_id_550293']"));
		cancelBook.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		//-----------------------------Robot_class_FullScreen_Shot---------------------------------------
		Robot robot=new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(screenSize);
		BufferedImage createScreenCapture = robot.createScreenCapture(rect);
		ImageIO.write(createScreenCapture, "png", new File("D:\\Selenium_Workspace\\Selenium_Project\\Selenium_Testing\\Screenshots\\img4.png"));
		Thread.sleep(5000);
		alert.accept();
		//-------------------------------Log_out----------------------------
		WebElement logOut = driver.findElement(By.id("logout"));
	    logOut.click();
	    //---------------------------logOut_ScreenShot------------------------------
	    TakesScreenshot tshot=(TakesScreenshot) driver;
		File screenshotAss = tshot.getScreenshotAs(OutputType.FILE);
		File des1=new File("D:\\Selenium_Workspace\\Selenium_Project\\Selenium_Testing\\Screenshots\\img5.png");
		FileHandler.copy(screenshotAss, des1);
		driver.close();
		}

}
