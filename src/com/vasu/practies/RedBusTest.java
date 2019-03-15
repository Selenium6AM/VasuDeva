package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBusTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath(".//*[@id='searchDropdownBox']")).click();
		Thread.sleep(2000);
		
		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='searchDropdownBox']/option"));
		System.out.println(list.size());
		
		for (WebElement element : list)
		{
			System.out.println(element.getText());
		}
		

	}

}
