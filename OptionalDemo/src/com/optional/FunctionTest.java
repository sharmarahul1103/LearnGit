package com.optional;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String args[])
	{
		Function<Integer,Double> half=a-> { 
			
			System.out.println("from half");
			return( (a/2.0));
		
		};
		System.out.println(half.apply(10));
		
		//Function<Integer,Double> modify=a-> a*4.0 ;
		
		
		half=half.andThen(a->a*3);
		
		System.out.println(half.apply(10));
		
		half=half.compose(a -> 
		                        {   System.out.println("from 2nd");
		                            return (a*3); 
		                        } );
		System.out.println(half.apply(10));
		
		
		Function<Integer, Integer> same=Function.identity();
		System.out.print(same.apply(10));
		
	}

}
