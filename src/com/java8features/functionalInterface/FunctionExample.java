package com.java8features.functionalInterface;

import java.util.function.Function;

public class FunctionExample {

	public static Function<String, String> function=name->name.toUpperCase();
	public static Function<String, String> addSomeString=name->name.toUpperCase()
			.concat("default");

	public static void main(String[] args) {
		System.out.println("Result is : "+function.apply("java8"));
		System.out.println("addSomeString results "+function.
				compose(addSomeString).apply("java8"));
	}

}
