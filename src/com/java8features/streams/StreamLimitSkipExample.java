package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {


	public static Optional<Integer> limit(List<Integer> integersList){
		return integersList.stream().limit(2)
				.reduce((x,y)->x+y);
	}

	public static Optional<Integer> skip(List<Integer> integersList){
		return integersList.stream().skip(2)
				.reduce((x,y)->x+y);
	}

	public static void main(String[] args) {
		List<Integer> integersList=Arrays.asList(6,7,8,9,10);
		System.out.println("limit "+limit(integersList));
		System.out.println("skip "+skip(integersList));


	}

}
