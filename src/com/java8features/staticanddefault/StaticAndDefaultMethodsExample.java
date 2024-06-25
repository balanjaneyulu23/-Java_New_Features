package com.java8features.staticanddefault;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StaticAndDefaultMethodsExample {
	
	

	public static void main(String[] args) {
		
		List<String> list =Arrays.asList("Adam", "Alex","Dan", "Eric", "Jenny","Mike");
		/*
		 * Collections.sort(list); System.out.println(list);
		 */
		
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		

	}	

}
