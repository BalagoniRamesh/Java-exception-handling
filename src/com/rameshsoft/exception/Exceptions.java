package com.rameshsoft.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		//System.out.println(10/0); //java.lang.ArithmeticException: / by zero
		//int[] a = {1,2,3,4};
		//System.out.println(a[7]); //java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 4
		//System.out.println("Ramesh".charAt(10));//java.lang.StringIndexOutOfBoundsException: String index out of range: 10
		
		//String str = null;
		//System.out.println(str.length()); //java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
		
		//Integer i = new Integer("ten"); //java.lang.NumberFormatException: For input string: "ten"
		//Scanner scn = new Scanner(System.in);
		//System.out.println("Enter the number");
		//scn.nextInt();
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Ramesh");
		Collections.sort(al);//java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
		
	}

}
