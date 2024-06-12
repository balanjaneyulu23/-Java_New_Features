package com.java8features.methodreferences;

import java.util.function.Function;

public class FunctionMethodReference {

	static Function<String, String> methodRef=s->s.toUpperCase();
	
	static Function<String, String> methodRef1=String::toUpperCase;

	public static void main(String[] args) {

		System.out.println("Method reference lambda "+methodRef.apply("java8"));
		System.out.println("Method reference  "+methodRef1.apply("java8"));


	}

}
