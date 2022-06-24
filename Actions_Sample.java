package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actions_Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GIRINATH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
		
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contact us']"));
		actions.contextClick(contact).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
		
	}

}
