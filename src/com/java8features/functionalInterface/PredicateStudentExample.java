package com.java8features.functionalInterface;

import java.util.List;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p1=student->student.getGradeLevel()>=3;
	static Predicate<Student> p2=student->student.getGpa()>=3.9;

	static void printStudentByGradeLevel() {
		System.out.println("printStudentByGradeLevel");
		List<Student>  studentList=StudentDataBase.getAllStudents();
		studentList.forEach(student->{
			if (p1.test(student)) {
				System.out.println(student);
			}
		});
	}

	static void printStudentByGpa() {
		System.out.println("printStudentByGpa");
		List<Student>  studentList=StudentDataBase.getAllStudents();
		studentList.forEach(student->{
			if (p2.test(student)) {
				System.out.println(student);
			}
		});
	}

	static void filterStudents() {
		System.out.println("printStudentByGpa and GradeLevel");
		List<Student>  studentList=StudentDataBase.getAllStudents();
		studentList.forEach(student->{
			if (p1.and(p2).test(student)) {
				System.out.println(student);
			}
		});
	}

	static void printAllStudents() {
		System.out.println("printAllStudents");
		List<Student>  studentList=StudentDataBase.getAllStudents();
		studentList.forEach(student->{
			if (p1.or(p2).negate().test(student)) {
				System.out.println(student);
			}
		});
	}
	public static void main(String[] args) {
		printStudentByGradeLevel();
		printStudentByGpa();
		filterStudents();
		printAllStudents();


	}

}
