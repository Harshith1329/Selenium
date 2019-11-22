package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".//Software//chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("lga")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.className("gNO89b")).click();
		
 		
		

	}

}
