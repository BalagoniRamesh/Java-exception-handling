package com.rameshsoft.exception;

import java.util.Scanner;

public class ThrowExp1 {
	static void status(int age) throws InvalidAgeException
	{
		if(age>18) 
			{
				System.out.println("Eligible for vote");
			}
			else
			{
				throw new InvalidAgeException();
			}
	}
	public static void main(String[] args) throws InvalidAgeException {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter age");
		int age =scn.nextInt();
		ThrowExp1.status(age);
	}

}
