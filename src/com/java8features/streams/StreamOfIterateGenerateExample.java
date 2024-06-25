package com.java8features.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {

	public static void main(String[] args) {

		Stream<String> names=Stream.of("Adam", "Bala", "Siva");
		names.forEach(System.out::println);

		Stream.iterate(1, x->x*2).limit(10)
		.forEach(System.out::println);

		Supplier<Integer>integerSupplier=new Random()::nextInt;
		Stream.generate(integerSupplier).limit(5).forEach(System.out::println);

	}

}
