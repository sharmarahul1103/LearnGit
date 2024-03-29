package com.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice1 {

	public static void main(String args[])
	{
		Stream<Integer> sm1=Stream.of(2,12,34,25,54,21);//creation stream by .of method of Stream interface
		System.out.println(sm1.count());
		System.out.println("part-1");
		
		Integer arr[]=new Integer[] {1,2,3,4,5};
		Stream<Integer> sm2=Arrays.stream(arr);      //creating stream with Arrays.stream method
		System.out.println(sm2.count());
		
		System.out.println("part-2");
		
		Stream<Integer> sm3=Stream.of(21,123,3,25,54,22);
		Stream<Integer> sm4=Stream.of(2,23,35,254,154,322);
		
		Stream.concat(sm3, sm4).forEach( System.out::println);
		System.out.println("part-3");
		
		List<Integer> values=Stream.iterate(1, n->n*2).limit(5).collect(Collectors.toList());
		values.forEach(System.out::println);
		System.out.println("part-4");
		
		List<Integer> ls=List.of(2,5,12,24,43,22,17,18);
	    List<Integer> ls2=ls.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(ls2);
		System.out.println("part-5");
		
		List<Integer> ls3=List.of(1,3,12,43,44,18,6);
        List<Integer>	 ls4=ls3.stream().map(value-> value*2).collect(Collectors.toList());
	    ls4.forEach(System.out::println);
		System.out.println("part-6");
	
	     List<Integer> ls5=List.of(1,3,12,43,44,18,6);
	     ls5.stream().sorted().forEach(System.out::println);
	     System.out.println("part-7");
	     ls5.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	 	System.out.println("part-8");
	     
	        
	}
}
