package com.abc.Demo;

import java.util.Scanner;

public class Launch
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("calculator");
		System.out.println("select the choice to perform the action");
		System.out.println("1. addition 2.subtraction");
		int choice = scan.nextInt();
		switch(choice)
		{
		case 1:
			addition(2,3);
		break;
		case 2:
		  subtraction(2,3);
		break;
		default:
			System.out.println("Invalid choice");
		break;
		}
	}
	public static void addition(int a , int b)
	{
		System.out.println(a+b);
	}
	public static void subtraction(int a,int b)
	{
		System.out.println(a-b);
	}

}
