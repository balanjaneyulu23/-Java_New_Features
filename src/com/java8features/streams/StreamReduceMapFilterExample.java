package com.java8features.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamReduceMapFilterExample {

	public static int getNoOfBooks() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student->student.getGender().equals("female"))
				.filter(student->student.getGradeLevel()>=3)
				.peek(student->System.out.println(student))
				.map(Student::getNoteBooks)
				.reduce(0,Integer::sum);
	}

	public static void main(String[] args) {

		System.out.println("getNoOfBooks "+getNoOfBooks());
	}

}
