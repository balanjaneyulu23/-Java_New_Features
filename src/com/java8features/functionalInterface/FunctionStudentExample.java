package com.java8features.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class FunctionStudentExample {

	static Map<String, Double> studentGradeMap=new HashMap<>();
	static Function<List<Student>, Map<String, Double>> function=students->{
		students.forEach(student->{
			
			if (PredicateStudentExample.p2.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());	
			}
		});
		return studentGradeMap;
	};

	public static void main(String[] args) {
		System.out.println(function.apply(StudentDataBase.getAllStudents()));

	}

}
