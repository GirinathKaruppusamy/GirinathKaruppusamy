package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRINATH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		
		wb.manage().window().maximize(); // Maximize window
		
		wb.get("https://www.amazon.in/"); // getmethod
		
		
	
	}

}
