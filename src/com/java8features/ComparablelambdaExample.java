package com.java8features;

import java.util.Comparator;

public class ComparablelambdaExample {

	public static void main(String[] args) {

		/**
		 * lagacy way to implement comparator. before java 8
		 * 
		 */
		Comparator<Integer> comparator=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2); // equal then return 0
				// 01>02 then return 1
				// o1<02 then return -1
			}
		};

		System.out.println("Comparator results using lagacy impl ..: "+comparator.compare(3, 2));

		Comparator<Integer> comparator1= (arg1,arg2)->arg1.compareTo(arg2);
		System.out.println("Comparator results using lambda impl ..: "+comparator1.compare(3, 2));

	}

}
