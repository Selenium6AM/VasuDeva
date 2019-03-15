package com.vasu.practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ceoandhra.nic.in/home.aspx");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement erg=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[5]/a"));
		
		WebElement asm=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[5]/ul/li[1]/a"));
		
		WebElement kys=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[5]/ul/li[1]/ul/li[7]/a"));
		Actions chain=new Actions(driver);
		
		chain.moveToElement(erg).moveToElement(asm).pause(2000).moveToElement(kys).click().build().perform();
		
		

	}

}
