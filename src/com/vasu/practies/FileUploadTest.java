package com.vasu.practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://tinypic.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("the_file")).sendKeys("E:\\Koala.jpg");
		//driver.findElement(By.id("the_file")).click();
		//autoit
		//Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fileupload.exe");

	}

}
