package com.rameshsoft.exception;

public class Throws1 {
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
	public static void main(String[] args) throws InterruptedException {
		Throws1 t = new Throws1();
		t.officeboy();
	}
}
