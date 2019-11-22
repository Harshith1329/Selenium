package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleJavaImage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//a[contains(.,'Images')]")).click();
		driver.findElement(By.xpath("//img[@id='rT8rqQKh8jt3DM:']")).click();
		//driver.findElement(By.id("rT8rqQKh8jt3DM:"));
		
		
		
	}

}
