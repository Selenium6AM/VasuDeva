package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://bing.com/");
		driver.manage().window().maximize();
		//identifying header section by using className and stored into webelement
		WebElement header=driver.findElement(By.className("sw_tb"));
		//capturing all the links under header by using tagName
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		System.out.println(headerLinks.size());
		for (int i = 0; i < headerLinks.size(); i++) 
		{
			System.out.println(headerLinks.get(i).getText());
		}
		

	}

}
