package com.rameshsoft.exception;

public class FinallyImp {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Ramesh".charAt(10));
		}
		finally 
		{
			int [] a = {0,1,2,3,4};
			System.out.println(a[10]);
		}
	}

}
