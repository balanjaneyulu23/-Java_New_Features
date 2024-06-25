package com.java8features.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMinByMaxByExample {
	
	public static Optional<Student> minBy_Example(){
		return StudentDataBase.getAllStudents().stream().
				collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student> maxBy_Example(){
		return StudentDataBase.getAllStudents().stream().
				collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}

	public static void main(String[] args) {
		System.out.println("minBy_Example "+minBy_Example().get());
		System.out.println("maxBy_Example "+maxBy_Example().get());
		
	}

}
