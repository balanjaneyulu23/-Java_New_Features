package com.java8features.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMappingExample {

	public static void main(String[] args) {
		List<String> namesList=StudentDataBase.getAllStudents()
				.stream().
				collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		Set<String> namesSet=StudentDataBase.getAllStudents()
				.stream().
				collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		
		
		System.out.println(" namesList "+namesList);
		System.out.println(" namesSet "+namesSet);

	}

}
