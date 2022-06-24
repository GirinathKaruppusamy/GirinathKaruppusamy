package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GIRINATH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		button.click();
		Thread.sleep(2000);

		WebElement date = driver.findElement(By.id("day"));
		//Thread.sleep(2000);
		Select s = new Select(date);
		s.selectByValue("20");
		
		WebElement month = driver.findElement(By.id("month"));
		//Thread.sleep(2000);
		Select s1 = new Select(month);
		s1.selectByVisibleText("Apr");			
		
		WebElement year = driver.findElement(By.id("year"));
		//Thread.sleep(2000);
		Select s2 = new Select(year);
		s2.selectByVisibleText("1998");


		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}
}
