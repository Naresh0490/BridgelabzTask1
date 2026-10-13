package com.bridge;

import java.util.Scanner;

class Subtraction
{
	public int subStraction(int a,int b)
	{
		return a-b;
	}
}
public class Calculator2 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Subtraction calculator = new Subtraction();
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int res = calculator.subStraction(a, b);
		System.out.println(res);
	}

}
