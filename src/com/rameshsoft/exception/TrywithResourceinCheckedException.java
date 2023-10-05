package com.rameshsoft.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class TrywithResourceinCheckedException {
public static void main(String[] args) throws IOException {
		try(FileInputStream fis = new FileInputStream("bac.txt"))
		{
			System.out.println("Hello ramesh");		
		}
		catch (FileNotFoundException f1) 
		{
			System.out.println(f1);
		}
		System.out.println("Rest of the code");
	}
}