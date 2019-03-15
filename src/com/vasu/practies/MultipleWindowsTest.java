package com.vasu.practies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://hdfcbank.com/");
		driver.manage().window().maximize();
		
		String homePage=driver.getWindowHandle();//111111
		//System.out.println(homePage);
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> windows=driver.getWindowHandles();//111111&222222
		
		for (String child:windows)
		{
			/*//System.out.println(child);
			driver.switchTo().window(child);
			//System.out.println(driver.getTitle());
			if (!driver.getTitle().equals("NetBanking"))
			{
				driver.close();
			}*/
			if (!child.equals(homePage)) 
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}
			
		}
		
		
	}

}
