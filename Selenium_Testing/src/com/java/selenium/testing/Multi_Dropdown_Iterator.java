package com.java.selenium.testing;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown_Iterator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_io\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.get("http:\\www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[5]")).click();
		Thread.sleep(2000);
		WebElement Multipledrop = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
        Select multi=new Select(Multipledrop);
        List<WebElement> options = multi.getOptions();
        int size = options.size();
        System.out.println("Number Of Element: "+size);
        System.out.println("All DropDown Options Are------");
        Iterator<WebElement> alldropelement=options.iterator();
         while (alldropelement.hasNext()) {
			System.out.println(alldropelement.next().getText());
			}
         System.out.println("All options Are Backward------------");
         ListIterator<WebElement> allselect=options.listIterator(options.size());
         while (allselect.hasPrevious()) {
					WebElement webElement = (WebElement) allselect.previous();
					System.out.println(webElement.getText());
				}
         if(multi.isMultiple()) {
        	multi.selectByIndex(1);
        	multi.selectByVisibleText("Loadrunner");
        	multi.selectByValue("2");
            }
        	System.out.println("Selected DropDown Options Are------");
        	List<WebElement> allSelectedOptions = multi.getAllSelectedOptions();
        	Iterator<WebElement> selectedElements= allSelectedOptions.iterator();
        	while (selectedElements.hasNext()) {
				System.out.println(selectedElements.next().getText());
				}
        	
    		WebElement firstSelectedOption = multi.getFirstSelectedOption();
    		System.out.println("First Seleted : "+firstSelectedOption.getText());
    		multi.deselectByIndex(1);
    		multi.deselectByValue("2");
    		multi.deselectByVisibleText("Loadrunner");
    		System.out.println("UnSelect DropDown Are-------");
    		List<WebElement> unSelectedOptions = multi.getAllSelectedOptions();
    		Iterator<WebElement> unselectedelement=unSelectedOptions.iterator();
    		while (unselectedelement.hasNext()) {
			  System.out.println(unselectedelement.next().getText()); 
				}
    		boolean multiple = multi.isMultiple();
            System.out.println("Is Multiple DropDown : "+multiple);
    		multi.deselectAll();
    		driver.close();
    		
				
			}
    		}


