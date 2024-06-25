package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamReduceExample {

	public static int multiplicationWithIdentity(List<Integer> integers) {
		return integers.stream().reduce(1, (a,b)->a*b);
	}

	public static Optional<Integer> multiplicationWithoutIdentity(List<Integer> integers) {
		return integers.stream().reduce((a,b)->a*b);
	}

	public static Optional<Student> getHighestGpaStudent(){
		return StudentDataBase.getAllStudents().stream()
				.reduce((s1,s2)->(s1.getGpa()>s2.getGpa())?s1:s2);
	}

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,3,5,7);
		System.out.println(multiplicationWithIdentity(numbers));
		Optional<Integer> results=multiplicationWithoutIdentity(numbers);
		System.out.println("results "+results.isPresent());
		System.out.println("results "+results.get());
		
		System.out.println(getHighestGpaStudent().get());


	}

}
