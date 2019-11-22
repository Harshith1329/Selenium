package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchJavaSel {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",".//Software//chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement gs1 = driver.findElement(By.name("q"));
		gs1.click();
		Thread.sleep(2000);
 		
		WebElement gs2 = driver.findElement(By.name("q"));
		gs2.clear();
		Thread.sleep(2000);
		
		//WebElement gs3 = driver.findElement(By.name("q"));
		gs2.sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();

	}

}
