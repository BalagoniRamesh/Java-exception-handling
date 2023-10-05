package com.rameshsoft.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws3 {
	void m1() throws InterruptedException, FileNotFoundException
	{
		System.out.println("Ramesh");
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream("abc.txt");
		System.out.println("Rest of the code");		
	}
	void m2()
	{
		try
		{
			m1();
		}
		catch (InterruptedException|FileNotFoundException f)
		{
			System.out.println("This exception is: "+f);
		}
	}
	public static void main(String[] args) {
		Throws3 t = new Throws3();
		t.m2();
	}
	
}
/*
o/p:
	Ramesh
	This exception is: java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
*/	
