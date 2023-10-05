package com.rameshsoft.exception;

import java.util.Scanner;
public class TrywithResource {
public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in))
		{
			System.out.println("Enter the number");
			int num = scn.nextInt();
			System.out.println(num);
		}
	}
}