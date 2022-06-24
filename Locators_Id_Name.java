package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Id_Name {
	public static void main(String[] args) throws Throwable {	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRINATH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://github.com/");
	Thread.sleep(2000);
	
	driver.navigate().to("https://github.com/login");
	
	WebElement email =  driver.findElement(By.id("login_field"));
	email.sendKeys("girinath@gmail.com");
	
	driver.findElement(By.name("password")).sendKeys("123456");
	
	driver.findElement(By.name("commit")).click();
	
	}

}
