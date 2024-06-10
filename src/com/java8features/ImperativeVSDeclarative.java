package com.java8features;

import java.util.stream.IntStream;

public class ImperativeVSDeclarative {

	public static void main(String[] args) {

		/**
		 * Imperative style programming example for summation of 0-100 numbers
		 */
		int sum =0;
		for (int i = 0; i <=100; i++) {
			sum+=i;
		}

		System.out.println("Sum of the numbers from 0 - 100 would be : "+sum);

		/**
		 * Declaratve programming style example for summation of 0-100 numbers
		 */
		int sum1 =IntStream.rangeClosed(0, 100).sum();
		System.out.println("sum of the numbers from 0-100 would be : "+sum1);


	}

}
