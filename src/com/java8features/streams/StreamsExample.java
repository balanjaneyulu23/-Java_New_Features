package com.java8features.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {

		// predicate 
		Predicate<Student> gradePredicate=student->student.getGradeLevel()>=3;
		Predicate<Student> gpaPredicate=student->student.getGpa()>=3.9;


		Map<String, List<String>> studentMap=  StudentDataBase.getAllStudents().stream()
				.peek(student->{
					System.out.println(student);
				})
				.filter(gradePredicate).filter(gpaPredicate)
				.peek(student->{
					System.out.println(student);
				})
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(studentMap);
	}

}
