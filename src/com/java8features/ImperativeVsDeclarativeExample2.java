package com.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {
		List<Integer> IntegerList= Arrays.asList(1,2,3,3,7,7,9,9,1,4,8,6);

		/**
		 * Imperative style programming for eliminate duplicate number's 
		 */
		List<Integer> uniqueNumbers=new ArrayList<>();

		for (Integer integer : IntegerList) {
			if (!uniqueNumbers.contains(integer)) {
				uniqueNumbers.add(integer);
			}

		}
		
		System.out.println("Unique list for Imperative style: "+uniqueNumbers);

		/**
		 * Declarative style programming for eliminating duplicate number's 
		 * 
		 */
		List<Integer>UniqueList=IntegerList.stream().distinct()
				.collect(Collectors.toList());

		System.out.println("Unique list for declarative style: "+UniqueList);
	}

}
