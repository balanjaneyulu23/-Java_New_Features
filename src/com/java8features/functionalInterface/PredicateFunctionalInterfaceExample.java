package com.java8features.functionalInterface;

import java.util.function.Predicate;

/**
 * Predicate functional interface would have test method that accept input and process it 
 * and then return boolean value
 */
public class PredicateFunctionalInterfaceExample {
	
	static Predicate<Integer> p1=i->i%2==0;
	static Predicate<Integer> p2=i->i%5==0;
	
	static void predicateAnd() {
		
		System.out.println("Predicate And: "+p1.and(p2).test(10));
	}
	
	
	static void predicateOr() {
		System.out.println("Predicate Or : "+p1.or(p2).test(9));
	}

	static void predicateNegate() {
		System.out.println("Predicate negate "+p1.or(p2).negate().test(9));
	}
	public static void main(String[] args) {
		
		System.out.println("Given numebr is even or not : "+p1.test(10));
		predicateAnd();
		predicateOr();
		predicateNegate();
		
		
	}

}
