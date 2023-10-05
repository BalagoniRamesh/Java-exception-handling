package com.rameshsoft.exception;

import java.util.Scanner;

public class ThrowExp3 {
		static void status(int age)
		{
			if(age>20)
			{
				System.out.println("Eligable for marriage");
			}
			else
			{
				throw new InvalidAgeRuntimeException();
			}
		}
		public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scn.nextInt();
		
		ThrowExp3.status(age);		
	}

}
