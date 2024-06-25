package com.java8features.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFlatMapExample {

	public static void main(String[] args) {

		List<String> studentActivities=
				StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).
				distinct().
				sorted().
				collect(Collectors.toList());


		long studentCount=StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().count();

		System.out.println(studentActivities);
		System.out.println(studentCount);

	}

}
