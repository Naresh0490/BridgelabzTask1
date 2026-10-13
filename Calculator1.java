package com.bridge;

import java.util.Scanner;

class Calculator
{
	public int add(int a,int b)
	{
		return a+b;
	}
}
public class Calculator1 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int res = calculator.add(a, b);
		System.out.println(res);
	}

}
