package com.java8features.streams;

import java.util.stream.Collectors;

import com.learnJava.data.StudentDataBase;

public class StreamCountingExample {

	public static long count() {
		return StudentDataBase.getAllStudents()
				.stream().
				filter(student->student.getGradeLevel()>=3.9)
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {
		System.out.println("Counting "+count());

	}

}
