package com.java8features.functionalInterface;

import java.util.List;
import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ConsumerFunctionalInterfaceExample {

	static Consumer<Student> c2=student->System.out.println(student);
	static Consumer<Student> c3=student->System.out.print(student.getName());
	static Consumer<Student> c4=student->System.out.println(student.getActivities());

	static void printStudents() {
		List<Student> students=StudentDataBase.getAllStudents();
		students.forEach(c2);
	}

	static void printStudentNameAndActivities() {
		List<Student> students =StudentDataBase.getAllStudents();
		students.forEach(c3.andThen(c4));
	}
	
	static void printStudentsUsingCondition() {
		List<Student> students =StudentDataBase.getAllStudents();
		students.forEach(student->{
			if (student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
				c3.andThen(c4).accept(student);
			}
		});
	}

	public static void main(String[] args) {

		/*
		 * Consumer<String> consumer=(s)->System.out.println(s.toUpperCase());
		 * consumer.accept("java8");
		 */

		//printStudents();
		//printStudentNameAndActivities();
		printStudentsUsingCondition();
		

	}

}
