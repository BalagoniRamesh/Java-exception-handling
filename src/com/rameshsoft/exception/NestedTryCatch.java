package com.rameshsoft.exception;

import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		try 
		{
			int num = scn.nextInt();
			System.out.println(10/num);
			try
			{
				System.out.println("Ramesh".charAt(10));
			}
			catch (StringIndexOutOfBoundsException s) {
			System.out.println(s);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
