package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.product.Product;

public class Streamproduct {
	
	public static void main(String args[])
	{
		List<Product> products=new ArrayList<Product>();
		products.add(new Product(1,"mouse",1000));
		products.add(new Product(2,"keyboard",2000));
		products.add(new Product(3,"pc",3000));
		products.add(new Product(4,"laptop",4000));
		products.add(new Product(5,"bag",5000));
		
//		Map<Integer,String> mp=product.stream().filter(p-> p.getPrice()>=2000).collect(Collectors.toMap(Product::getPid, Product::getPname));
//		System.out.println(mp);
		
		Predicate<Product> p1=((prod)-> prod.getPrice()>3000);
//		Supplier<Integer> s1=(()-> 10);
//		Consumer<Integer> c1=((c)-> System.out.println(c));
//		
		
	products.stream().filter(p1).collect(Collectors.toList()).forEach(System.out::println);
	products.stream().map(p-> p.getPrice()*10 ).forEach(System.out::println);	
	
	
	
	}

}
