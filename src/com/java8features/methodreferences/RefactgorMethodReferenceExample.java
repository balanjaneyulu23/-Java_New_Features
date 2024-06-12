package com.java8features.methodreferences;

import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class RefactgorMethodReferenceExample {

	static Predicate<Student> predicate=RefactgorMethodReferenceExample::greaterthanGradeLevel;

	public static boolean greaterthanGradeLevel(Student student) {
		return student.getGradeLevel()>=3;
	}

	public static void main(String[] args) {
		System.out.println(predicate.test(StudentDataBase.studentSupplier.get()));
	}
}
