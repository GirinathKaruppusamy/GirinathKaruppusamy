package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Robot_Concepts {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GIRINATH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("amazon");		
		Thread.sleep(2000);
		//Actions ac = new Actions(driver);
		//ac.contextClick(search);
		
		
	
		
	}

}
