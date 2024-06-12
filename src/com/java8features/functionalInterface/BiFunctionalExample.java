package com.java8features.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class BiFunctionalExample {

	static Map<String , Double> studentgradeMap=new HashMap<>();
	static BiFunction<List<Student>, Predicate<Student>, 
	Map<String, Double>> function=(students,predicate)->{
		students.forEach(student->{
			if (predicate.test(student)) {
				studentgradeMap.put(student.getName(), student.getGpa());
			}
		});

		return studentgradeMap;
	};

	
	public static void main(String[] args) {

		System.out.println(function.apply(StudentDataBase.getAllStudents(), 
				PredicateStudentExample.p2));
	}

}
