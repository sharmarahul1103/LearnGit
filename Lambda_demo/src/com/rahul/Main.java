package com.rahul;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("my system starts");
        
        myinter i=new myinter() {

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("first anonymous class");
			} 
        	
        	
        };
        
        i.sayHello();
        
        myinter obj2=()->{ System.out.println("using lambda expression");};
        obj2.sayHello();
        
        sum obj=(a,b)->{ return a+b; };
        
        System.out.println(obj.add(4, 8));
        System.out.println(obj.add(7, 9));
	}

}
