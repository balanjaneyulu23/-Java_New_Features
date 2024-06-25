package com.java8features.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamFilterExample {

	public static List<Student> filterStudents(){
		return StudentDataBase.getAllStudents().stream().
				filter(student->student.getGender().equals("female"))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		filterStudents().forEach(System.out::println);
	}

}
