package com.vasu.java;

import java.util.Scanner;

public class IfElseStmtTest 
{
	public static void main(String[] args) 
	{
		// to check the given is even/odd 
		
		//int n=48;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Even Number");
		}else
		{
			System.out.println("Odd Number");
		}
	}

}
