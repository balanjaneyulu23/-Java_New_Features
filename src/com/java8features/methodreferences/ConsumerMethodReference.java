package com.java8features.methodreferences;

import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ConsumerMethodReference {

	static Consumer<Student> consumer= System.out::println;
	static Consumer<Student> consumer1=Student::printListOfActivities;

	public static void main(String[] args) {
		StudentDataBase.getAllStudents().forEach(consumer);
		StudentDataBase.getAllStudents().forEach(consumer1);
	}

}
