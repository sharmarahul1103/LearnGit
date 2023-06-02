package com.optional;

import java.util.Optional;

public class OptionalTest {
	public static Optional<String> getName()
	{
		String name="rahul";
		return Optional.ofNullable(name);
	}
	
	public static void main(String args[])
	{
		String str=null;
		Optional<String> op=Optional.ofNullable(str);
		System.out.println(op.isPresent());
		
	
		
	System.out.println(op.get());
	Optional<String> nameOptional=getName();
	System.out.println(nameOptional.orElse("empty string"));
		
		
	}

}
