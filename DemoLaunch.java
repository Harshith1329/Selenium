package com.Day1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//Software//chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("alia bhat");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("ranbir");
		
		WebElement log = driver.findElement(By.id("loginbutton"));
		log.click();
		
		
	}

}
