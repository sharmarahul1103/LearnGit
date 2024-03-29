package com.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String args[]) {
		
		
		Consumer<Integer> show = (a) -> {
			System.out.print(a+ "::");
		};
		
		
		show.accept(10);
		System.out.println("");
		
		Consumer<List<Integer>> modify=list-> { 
			                  for(int i=0; i<list.size();i++)
			                  { 
			                	  list.set(i,2*list.get(i));
			                  }	
			                  System.out.println("from modify");
		};
		
		Consumer<List<Integer>> display=ls1->{ls1.stream().forEach(show);}; 
		
	  List<Integer> ls=new ArrayList<>();
	  ls.add(11);
	  ls.add(12);
	  ls.add(13);
	  System.out.println(ls);
	  
//	  modify.accept(ls);
//	  display.accept(ls);
//	  System.out.println("");
	  
	  modify.andThen(display).accept(ls);
	}

}
