package com.selenium;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRINATH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (WebElement datas : alldata) {
			System.out.println(datas.getText());
		}
				
	}

}
