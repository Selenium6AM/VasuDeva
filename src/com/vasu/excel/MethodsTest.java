package com.vasu.excel;

public class MethodsTest 
{
	//with out return type without  parameters
	public  void  add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		
	}

	public static void main(String[] args)
	{
		
		MethodsTest v=new MethodsTest();
		v.add();//calling a method with method name//it won't return a value
		/*int res=v.add();//calling method with variable//it will return a value
		System.out.println(res);*/
		

	}

}
