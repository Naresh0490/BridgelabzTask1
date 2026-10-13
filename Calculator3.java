package com.bridge;

import java.util.Scanner;

class Multiplication
{
	public long multi(int a,int b)
	{
		return a*b;
	}
}

public class Calculator3 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Multiplication multiplication = new Multiplication();
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		long res = multiplication.multi(a, b);
		System.out.println(res);
	}

}
