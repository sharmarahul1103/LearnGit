package com.rahul;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {
	public static void main(String args[])
	{
		ArrayList<Product> productList=new ArrayList<Product>();
	   productList.add(new Product(1, "laptop",2000));
	   productList.add(new Product(2, "mouse",20000));
	   productList.add(new Product(3, "keyboard",10000));
	   productList.add(new Product(4, "harddisk",5000));	
	  List<Float> productFilter=productList.stream().
			                                 filter(p->p.price>5000).
			                                 map(p->p.price).
			                                 collect(Collectors.toList());
	
	System.out.println(productFilter);
	
	List<Integer> list = new ArrayList<Integer>();

	for(int i = 1; i< 10; i++){
	      list.add(i);
	}

	Stream<Integer> stream = list.stream();
	stream.forEach(p -> System.out.println(p));
	
	}

}
