package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRINATH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver wb = new ChromeDriver();
		
		wb.manage().window().maximize();		
		Thread.sleep(2000);
		
		wb.get("https://www.amazon.in/");		
		Thread.sleep(2000);
		
		wb.switchTo().newWindow(WindowType.TAB);		
		wb.get("https://github.com/");		
		Thread.sleep(2000);		
		
		wb.navigate().to("https://www.codechef.com/");		
		Thread.sleep(2000);
		
		wb.navigate().back();
		Thread.sleep(2000);
		
		wb.navigate().forward();
		Thread.sleep(2000);
		
		wb.navigate().refresh();
		Thread.sleep(2000);
		
		String url = wb.getCurrentUrl();
		System.out.println(url);
		
		String title = wb.getTitle();
		System.out.println(title);	
				
		wb.close();
		Thread.sleep(2000);
		
		wb.quit();
	}

}
