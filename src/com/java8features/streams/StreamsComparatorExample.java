package com.java8features.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsComparatorExample {


	public static List<Student> sortStudentByName(){
		return StudentDataBase.getAllStudents().stream().
				sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	}

	public static List<Student> sortStudentBygpa(){
		return StudentDataBase.getAllStudents().stream().
				sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
	}

	public static List<Student> sortStudentBygpaDesc(){
		return StudentDataBase.getAllStudents().stream().
				sorted(Comparator.comparing(Student::getGpa).reversed()).collect(Collectors.toList());
	} 
	public static void main(String[] args) {

		sortStudentByName().forEach(System.out::println);
		sortStudentBygpa().forEach(System.out::println);
		sortStudentBygpaDesc().forEach(System.out::println);


	}

}
