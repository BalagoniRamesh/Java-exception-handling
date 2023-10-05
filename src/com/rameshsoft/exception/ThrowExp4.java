package com.rameshsoft.exception;

import java.util.Scanner;

public class ThrowExp4 {
	static void status(int age)
	{
		if(age > 21)
		{
		System.out.println("Eligible for marriage");
		}
		else
		{
			throw new InvalidAgeExceptionparam("You are not eligible for marriage");
		}
	}
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter age");
			int age = scn.nextInt();
			
			ThrowExp4.status(age);
		}

}
