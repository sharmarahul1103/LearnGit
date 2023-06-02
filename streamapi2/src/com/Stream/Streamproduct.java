package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.product.Product;

public class Streamproduct {
	
	public static void main(String args[])
	{
		List<Product> product=new ArrayList<Product>();
		product.add(new Product(1,"mouse",1000));
		product.add(new Product(2,"keyboard",2000));
		product.add(new Product(3,"pc",3000));
		product.add(new Product(4,"laptop",4000));
		product.add(new Product(5,"bag",5000));
		
		Map<Integer,String> mp=product.stream().filter(p-> p.getPrice()>=2000).collect(Collectors.toMap(Product::getPid, Product::getPname));
		System.out.println(mp);
		
		
	}

}
