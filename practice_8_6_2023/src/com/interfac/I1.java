package com.interfac;

public interface I1 {
	default  void show1()
	{
		System.out.println("inside show I1");
	}

	public void display();
	static void staticMethod()
	{
		System.out.println("inside static method");
	}
}
