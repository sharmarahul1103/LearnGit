package com.rahul;

public class Demo implements myinter {

	

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("saying hello");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myinter obj=new Demo();
		obj.sayHello();
            
	}

}
