package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Amazon.in");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(drop);
		sl.selectByIndex(23);
		sl.deselectByIndex(23);
		//sl.selectByVisibleText("Books");
		//sl.selectByValue("search-alias=computers");
		/*List<WebElement> dropList=sl.getOptions();
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++)
		{
			System.out.println(dropList.get(i).getText());
		}*/
		//System.out.println(sl.isMultiple());
		//System.out.println(sl.getFirstSelectedOption().getText());
		List<WebElement> selected=sl.getAllSelectedOptions();
		System.out.println(selected.size());
		for (WebElement element : selected) 
		{
			System.out.println(element.getText());
		}
	}

}
