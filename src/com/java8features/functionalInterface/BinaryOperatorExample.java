package com.java8features.functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator=(a,b)->a.compareTo(b);

	static BinaryOperator<Integer> binaryOperator=(a,b)->a*b;
	
	static BinaryOperator<Integer> maxBy= BinaryOperator.maxBy(comparator);
	static BinaryOperator<Integer> minBy= BinaryOperator.minBy(comparator);
	
	public static void main(String[] args) {
		System.out.println(binaryOperator.apply(5, 2));
		
		System.out.println("maxBy "+maxBy.apply(5, 4));
		System.out.println("minBy "+minBy.apply(5, 4));

     
        

	}

}
