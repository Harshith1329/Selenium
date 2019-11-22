package com.Day1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver", ".//Software//chromedriver.exe");
				
				WebDriver w1= new ChromeDriver();
				w1.get("https://www.youtube.com");
				w1.manage().window().maximize();
				System.out.println(w1.getCurrentUrl());
				w1.navigate().back();
				Thread.sleep(2000);
				w1.navigate().forward();
				Thread.sleep(2000);
				w1.navigate().refresh();
				Thread.sleep(2000);
				
				
				WebDriver w2= new ChromeDriver();
				w2.get("https://www.flipkart.com/");
				w2.manage().window().maximize();
				System.out.println(w2.getCurrentUrl());
				w2.navigate().back();
				Thread.sleep(2000);
				w2.navigate().forward();
				Thread.sleep(2000);
				w2.navigate().refresh();
				Thread.sleep(2000);
				
				
				WebDriver w3= new ChromeDriver();
				w3.get("https://twitter.com/");
				w3.manage().window().maximize();
				System.out.println(w3.getCurrentUrl());
				w3.navigate().back();
				Thread.sleep(2000);
				w3.navigate().forward();
				Thread.sleep(2000);
				w2.navigate().refresh();
				Thread.sleep(2000);
				
				
				
				WebDriver w4= new ChromeDriver();
				w4.get("https://www.apple.com/");
				w4.manage().window().maximize();
				System.out.println(w4.getCurrentUrl());
				w4.navigate().back();
				Thread.sleep(2000);
				w4.navigate().forward();
				Thread.sleep(2000);
				w4.navigate().refresh();
				Thread.sleep(2000);
				WebDriver w5= new ChromeDriver();
				w5.get("https://www.shiksha.com/");
				w5.manage().window().maximize();
				System.out.println(w5.getCurrentUrl());
				w5.navigate().back();
				Thread.sleep(2000);
				w5.navigate().forward();
				Thread.sleep(2000);
				w5.navigate().refresh();
				Thread.sleep(2000);
				w1.quit();
				w2.quit();
				w3.quit();
				w4.quit();
				w5.quit();
			}
		

	}


