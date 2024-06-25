package com.java8features.streams;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamSumAvgExample {

	public static int sum() {
		return StudentDataBase.getAllStudents().
				stream().collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static Double avg() {
		return StudentDataBase.getAllStudents().
				stream().collect(Collectors.averagingInt(Student::getNoteBooks));
	}

	public static void main(String[] args) {

		System.out.println("sum  "+sum());
		System.out.println("avg  "+avg());
	}

}
