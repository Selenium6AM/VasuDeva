package com.vasu.practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Gmail.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//global wait
		WebDriverWait myWait=new WebDriverWait(driver, 30);
		driver.findElement(By.id("identifierId")).sendKeys("vasu.584");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		driver.findElement(By.name("password")).sendKeys("Qedge");

	}

}
