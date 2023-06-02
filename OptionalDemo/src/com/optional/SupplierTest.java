package com.optional;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String args[]) {
		Supplier<Double> randomValue = () -> {
		return	Math.random();
		};
		
		System.out.println(randomValue.get());
	}

}