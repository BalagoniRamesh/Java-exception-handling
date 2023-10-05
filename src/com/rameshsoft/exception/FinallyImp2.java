package com.rameshsoft.exception;

public class FinallyImp2 {
		int m1() 
		{
			try
			{
				return 10;
			}
			catch (ArithmeticException e) 
			{
				return 20;
			}
			finally
			{
				return 30;
			}
		}
		public static void main(String[] args) {
			FinallyImp2 f = new FinallyImp2();
			int x = f.m1();
			System.out.println(x);
		}
}
