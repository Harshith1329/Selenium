package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".//Software//chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://gmail.com");
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("harshithprabhakar@gmail.com",Keys.ENTER);	
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("harshith",Keys.ENTER);
		
		
		

	}

}
