package com.rahul;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { 
			
			int arr[]=new int[5];
			arr[8]=30/0;
			
		}
		
		catch(ArrayIndexOutOfBoundsException  | ArithmeticException e)
		  {   System.out.println(e); }
	}

}
