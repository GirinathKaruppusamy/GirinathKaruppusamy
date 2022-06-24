package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSample {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRINATH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[@role=\'button\'])[2]")).click();
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'number')]")).sendKeys("Girinath");
	
		
		//WebElement surname = driver.findElement(By.id("u_i_d_5r"));
		//surname.sendKeys("kpg");
		
	}

}
