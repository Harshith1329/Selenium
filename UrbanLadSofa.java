package com.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadSofa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		List<WebElement> livingMenu = driver.findElements(By.xpath("//span[contains(.,'Living')]/parent::li/descendant::ul[@class='taxonslist']/li"));
		
			
		for(WebElement name : livingMenu)
			System.out.println(name.getText());
	}

}
