package com.vasu.practies;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowserTest 
{
	public static void main(String[] args)
	{
System.setProperty("webdriver.ie.driver", "C:/Users/vasu/Downloads/IEDriverServer.exe");
InternetExplorerDriver driver=new InternetExplorerDriver();
driver.get("Http://Amazon.in");


	}

}
