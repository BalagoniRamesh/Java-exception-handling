package com.rameshsoft.exception;

public class FinallyBlock1 {
	public static void main(String[] args) {
			try
			{
				System.out.println(10/2);
			}catch(ArithmeticException a)
			{
			System.out.println(a);
			}
			finally
			{
				System.out.println("Rest of the code");
			}
		}
}
