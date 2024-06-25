package com.java8features.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMapExample {

	public static List<String> namesList(){
		return StudentDataBase.getAllStudents().stream().map(Student::getName)
				.map(String::toUpperCase).toList();
	}

	public static Set<String> namesSet(){
		return StudentDataBase.getAllStudents().stream().map(Student::getName)
				.map(String::toUpperCase).collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		System.out.println(namesList());
		System.out.println(namesSet());


	}

}
