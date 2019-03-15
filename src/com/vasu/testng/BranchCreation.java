package com.vasu.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BranchCreation extends Primusbank
{
@Test
public void branchCreation() throws Exception
{
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	driver.findElement(By.id("BtnNewBR")).click();
	driver.findElement(By.id("txtbName")).sendKeys("Vasu4567");
	driver.findElement(By.id("txtAdd1")).sendKeys("Selenium123");
	driver.findElement(By.id("txtZip")).sendKeys("44444");
	
	Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
	country.selectByIndex(1);
	Thread.sleep(2000);
	Select state=new Select(driver.findElement(By.id("lst_stateI")));
	state.selectByIndex(1);
	Thread.sleep(2000);
	Select city=new Select(driver.findElement(By.id("lst_cityI")));
	city.selectByIndex(1);
	
	driver.findElement(By.id("btn_insert")).click();
	
	Alert al=driver.switchTo().alert();
	
	String msg=al.getText();
	al.accept();
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
}
}
