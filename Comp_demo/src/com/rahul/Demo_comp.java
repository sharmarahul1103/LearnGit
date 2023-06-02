
package com.rahul;
import java.util.*;

public class Demo_comp implements Comparable<Demo_comp> {
	
	public int rollno;
	public String name;
	public int age;
	
	public Demo_comp(int rollno, String name, int age)
	{
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
	
	public int compareTo(Demo_comp obj)
	{   
		if(age==obj.age)
		{ return 0;}
		
		else if(age>obj.age)
		{  return 1;}
		
		else 
		{ return -1; }
	}

	

	}


