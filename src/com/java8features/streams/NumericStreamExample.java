package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

	public static int SumOfNumbers(List<Integer> integers) {
		return integers.stream().reduce(0, (x,y)->x+y);
	}
	
	public static int SumOfNumb() {
		return IntStream.rangeClosed(1, 6).sum();
	}

	public static void main(String[] args) {
		List<Integer> integers =Arrays.asList(1,2,3,4,5,6);
		System.out.println("SumOfNumbers :: "+SumOfNumbers(integers));
		System.out.println(" SumOfNumb "+SumOfNumb());


	}

}
