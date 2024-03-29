package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
	public static void main(String args[])
	{
		List<Integer> list1=List.of(1,3,2,6,22,24,12,16);
		List<Integer> list2=new ArrayList<Integer> ();
		list2.add(23);
		list2.add(12);
		List<Integer> filterList=list1.stream().filter(i->i%2==0).collect(Collectors.toList()); //filtering even values
	
	System.out.println(filterList);
	
	List<Integer> newList=list1.stream().filter(p->p>20).collect(Collectors.toList());
	System.out.println(newList);
	
	//creating empty stream
	Stream<Object> estream=Stream.empty();
	String names[]= {"abc","def" ,"fgh"};
	Stream<String> stream1=Stream.of(names);
	stream1.forEach(e-> { System.out.println(e);});
	estream.forEach(e-> 
	                   { System.out.print(e);}
	
			        );
	
	//Stream<Object> streamBuilder=Stream.builder().build();
	
	IntStream stream=Arrays.stream(new int[] {2,4,23,12});
	stream.forEach(e->{System.out.println(e);});
	
	List<String> names1=List.of("delhi","mumbai","banglore","noida");
	List<String> newnames = names1.stream().filter(e-> e.startsWith("d")).collect(Collectors.toList());
	System.out.println(newnames);
	
	List<Integer> numbers=List.of(2,5,1,12,34);
	List<Integer> newNumbers=numbers.stream().map(i->i*i).collect(Collectors.toList());
	System.out.println(newNumbers);
	
	//sorting data
	numbers.stream().sorted().forEach(System.out::println);
	Integer min=numbers.stream().min((i,j)-> i.compareTo(j)).get();
	System.out.println(min);
	
	Integer max=numbers.stream().max((x,y)-> x.compareTo(y)).get();
		System.out.println(max);
	}

}
