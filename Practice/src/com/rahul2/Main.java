package com.rahul2;
import com.rahu.GenericDemo;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericDemo<Integer>  iobj=new GenericDemo<Integer>(15);
		System.out.println(iobj.getObject());
		
		GenericDemo<String>  iobj2=new GenericDemo<String>("Hello java");
		System.out.println(iobj2.getObject());

	}

}
