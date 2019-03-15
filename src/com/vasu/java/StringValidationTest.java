package com.vasu.java;

public class StringValidationTest 
{
	public static void main(String[] args) 
	{
		String data="Selenium Training";
		String data1="Vasudeva";
		/*if (data.equals(data1))
		{
			System.out.println("equal");
		}else
		{
			System.out.println("not equal");
		}*/
		if (data.contains(data1)) 
		{
			System.out.println("exist");
		}else
		{
			System.out.println("not exist");
		}

	}

}
