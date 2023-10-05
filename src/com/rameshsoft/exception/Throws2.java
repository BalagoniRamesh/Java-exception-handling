package com.rameshsoft.exception;

public class Throws2 {
	void studentDetails() throws InterruptedException
	{
		System.out.println("Ramesh sleeping");
		Thread.sleep(3000);
		System.out.println("ramesh");
	}
	void hod() throws InterruptedException
	{
		studentDetails();
	}
	void principal() throws InterruptedException
	{
		hod();
	}
	void officeboy() throws InterruptedException
	{
		principal();
	}
	public static void main(String[] args) {
		Throws2 t = new Throws2();
		try
		{
			t.officeboy();
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
