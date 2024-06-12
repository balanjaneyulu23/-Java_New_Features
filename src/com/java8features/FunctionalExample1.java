package com.java8features;

import com.java8features.functionalInterface.FunctionExample;

public class FunctionalExample1 {
	public static String  performCancat(String str) {
		return FunctionExample.addSomeString.apply(str);
	}

	public static void main(String[] args) {
		System.out.println("Results "+performCancat("hello"));
	}

}
