package com.optional;

import java.util.function.Predicate;

public class Predicatetest {
	
	public static void pred(int number , Predicate<Integer> predicate)
	{
		if(predicate.test(number))
		{ 
			System.out.println(number+" from number");
		}
	}
	
	public static void main(String s[])
	{
		Predicate<Integer> lessthan=(i)->(i<10);
		System.out.println(lessthan.test(5));                    //single predicate
		
		Predicate<Integer> p1=(i)->(i>20);
		System.out.println(p1.test(25)+" from test");
		Predicate<Integer> p2=(i)->(i<30);
		
		boolean result=p1.and(p2).test(31);      
		System.out.println(result);                         //And operation
		
		boolean result2=p1.and(p2).negate().test(31);
		System.out.println(result2);
		pred(10,(i)-> i>7);
	}

}
