package com.bridge;

import java.util.Scanner;

class Division
{
	public int division(int a,int b)
	{
		return a/b;
	}
	
	
}
public class Calculator4 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Division division = new Division();
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int res = division.division(a, b);
		System.out.println(res);
		
	}

}
