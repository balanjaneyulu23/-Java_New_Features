package com.java8features.optional;

import java.util.Optional;

public class OptionalExample {


	public static Optional<String> ofNullable(){
		return Optional.ofNullable("Hello");
	}

	public static Optional<String> of(){
		return Optional.of("hello");
	}
	
	
	public static Optional<String> empty(){
		return Optional.ofNullable(null);
	}
	
	public static void main(String[] args) {
		System.out.println("ofNullable() " +ofNullable());
		System.out.println("of() " +of());
		System.out.println("empty "+empty());

	}

}
