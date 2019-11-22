package com.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("java");
		
		Thread.sleep(2000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		for(WebElement list : suggestions)
			System.out.println(list.getText());
		
		driver.findElement(By.xpath("//div[@class='sbl1']")).click();

	}

}
