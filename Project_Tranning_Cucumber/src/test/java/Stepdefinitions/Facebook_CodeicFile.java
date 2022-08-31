package Stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook_CodeicFile {

public static WebDriver driver =null;
	@Given("user on facebook login page")
	public void user_on_facebook_login_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\myuva\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    ChromeOptions ch=new ChromeOptions();
	    ch.addArguments("--start-maximized");
	    driver =new ChromeDriver(ch);
	    //driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/login/");
	    
	}

	@When("user pass value email id on email textbox")
	public void user_pass_value_email_id_on_email_textbox() {
	   
		WebElement inputEmail = driver.findElement(By.id("email"));
		inputEmail.sendKeys("jay123@gmail.com");
		
	}

	@When("user pass value on password on pass textbox")
	public void user_pass_value_on_password_on_pass_textbox() {
	   
		WebElement inputPass = driver.findElement(By.id("pass"));
		inputPass.sendKeys("jay123");
		
	}

	@When("user click logib button")
	public void user_click_logib_button() {
	   
		WebElement logButton = driver.findElement(By.id("loginbutton"));
		logButton.click();
		
	}

	@Then("user navigate on facebook home page")
	public void user_navigate_on_facebook_home_page() {
	   String actualResult="https://www.facebook.com/login/";
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
		
		assertEquals(actualResult,currentUrl);
		
		driver.quit();
	}

}
