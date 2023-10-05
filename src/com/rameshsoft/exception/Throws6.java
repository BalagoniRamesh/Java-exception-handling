package com.rameshsoft.exception;

public class Throws6
{
	void m1()
	{
		System.out.println(10/0);
	}
	void m2()
	{
		m1();
	}
	public static void main(String[] args) {
		Throws6 t= new Throws6();
		try
		{
			t.m2();
		}
		catch(ArithmeticException a)
		{
			System.out.println("This exception is: "+a);
		}
	}
}
