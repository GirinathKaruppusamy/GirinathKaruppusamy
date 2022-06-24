package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GIRINATH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(frame);
		
		WebElement button = driver.findElement(By.id("Click"));
		button.click();
		System.out.println(button.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(iframe1);
		
		WebElement iframe2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(iframe2);
		
		WebElement button1 = driver.findElement(By.id("Click1"));
		button1.click();
		System.out.println(button1.getText());
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		
		List<WebElement> countFrames = driver.findElements(By.tagName("iframe"));
		int size = countFrames.size();
		System.out.println("Total Number of Frames are :"+size);
	}

}
