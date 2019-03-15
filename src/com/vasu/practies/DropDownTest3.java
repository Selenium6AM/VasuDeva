package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest3 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://facebook.com");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("day"));
		List<WebElement> dropList=drop.findElements(By.tagName("option"));
		System.out.println(dropList.size());
		for (int i = 0; i <dropList.size(); i++)
		{
			//System.out.println(dropList.get(i).getText());
			/*if (dropList.get(i).getText().equals("13"))
			{
				dropList.get(i).click();
			}*/
			dropList.get(i).click();
		}
		

	}

}
