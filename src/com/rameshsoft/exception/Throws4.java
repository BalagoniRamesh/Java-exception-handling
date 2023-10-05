package com.rameshsoft.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws4 {
	void m1() throws InterruptedException, FileNotFoundException
	{
		System.out.println("Ramesh");
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream("abc.txt");
		System.out.println("Rest of code");
	}
	void m2()
	{
		try
		{
			m1();
		}
		catch (Exception e) {
			System.out.println("This exception is: "+e);
		}
	}
	public static void main(String[] args) {
		Throws4 t = new Throws4();
		t.m2();
	}

}
