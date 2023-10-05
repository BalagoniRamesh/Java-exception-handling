package com.rameshsoft.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Throws5 {
	void m1() throws InterruptedException, FileNotFoundException
	{
		System.out.println("Ramesh");
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream("abc.text");
		System.out.println("Rest");
	}
	void m2() throws FileNotFoundException
	{
		try
		{
			m1();
		}
		catch(InterruptedException f)
		{
			f.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		Throws5 t = new Throws5();
		try
		{
			t.m2();
		}catch(FileNotFoundException i)
		{
			i.printStackTrace();
		}
	}
}