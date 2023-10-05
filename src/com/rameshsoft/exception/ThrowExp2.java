package com.rameshsoft.exception;

import java.util.Scanner;

public class ThrowExp2 {
	static void status(int age) throws InvalidAgeExceptionparam
	{
		if(age>20)
		{
			System.out.println("Eligible for marriage");
		}
		else
		{
			throw new InvalidAgeExceptionparam("You are not eligable for marriage");
		}
	}
	public static void main(String[] args) throws InvalidAgeExceptionparam{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scn.nextInt();
		
		ThrowExp2.status(age);

	}

}
