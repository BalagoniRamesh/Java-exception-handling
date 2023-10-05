package com.rameshsoft.exception;
public class FinallyBlock2 {
public static void main(String[] args) {
		System.out.println(10/0);
		try
		{
			
		}catch(ArithmeticException a)
		{
		}
		finally
		{
			System.out.println("Rest of the code");
		}
	}
}

/*
public class FinallyBlock2 {
public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
			// }catch(ArithmeticException a)
		}catch(StringIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println("Rest of the code");
		}
	}
}
*/
