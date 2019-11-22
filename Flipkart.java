package com.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		
		//a[contains(.,'Electronics')]/parent::li/parent::ul/descendant::li[@class='_1KCOnI _3ZgIXy']/a[contains(.,'Mi']
		//path of Mi from Electronics --> parent --> descendant --> Mi
		
		// List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\'_114Zhd\']/li"));
		 
		 /*for(WebElement name : list)
			 System.out.println(name.getText());
		*/
	}

}
