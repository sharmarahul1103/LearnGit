package com.main;
import com.rahul.Demo_comp;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Demo_comp> al=new ArrayList<Demo_comp>();
		al.add(new Demo_comp(101,"rahul",21));
		al.add(new Demo_comp(103,"rohit",23));
		al.add(new Demo_comp(105,"hello",25));
		
		System.out.println(al);
		
		Collections.sort(al);
		for(Demo_comp obj:al)
		{ System.out.println(obj.rollno+" "+obj.name+" "+obj.age);}
		
		
		

	}

}
