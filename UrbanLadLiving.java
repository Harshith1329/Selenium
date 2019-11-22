package com.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadLiving {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		
		WebElement dining = driver.findElement(By.xpath("//li[@class='topnav_item diningunit']/span[@class='topnav_itemname']"));
		//WebElement dining  = driver.findElement(By.xpath("//span[contains(.,'Dining')]"));
		System.out.println(dining.getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(dining.getText());
		
		
		//li/a[contains(.,'Stores')] 	---> Xpath of "stores"
		
		//a[contains(.,'Track Order')]  ---> Xpath of "Track Order"
		
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li")); // --> list of WebElements
		
		for(WebElement name : menu )
			System.out.println(name.getText());
	}

}
