package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRINATH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			
			
			driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();			
			driver.switchTo().alert().accept();			
			
			driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();			
			driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();			
			driver.switchTo().alert().dismiss();
			
			driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
			driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
			driver.switchTo().alert().sendKeys("Selenium User");
			driver.switchTo().alert().accept();
			
			
		}
}
