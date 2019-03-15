package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.co.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gb_P")).click();
		//capture title
		System.out.println(driver.getTitle());
		//capture url
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		//capture title
				System.out.println(driver.getTitle());
				//capture url
				System.out.println(driver.getCurrentUrl());
				driver.close();

	}

}
