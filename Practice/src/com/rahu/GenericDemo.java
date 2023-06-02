package com.rahu;

public class GenericDemo<T> {
	T obj;
	
	public GenericDemo(T obj)
	{  this.obj=obj; }
	
	public T getObject()
	{ return this.obj; }
	

}
