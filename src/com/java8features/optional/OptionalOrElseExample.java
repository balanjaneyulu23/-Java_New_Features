package com.java8features.optional;

import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class OptionalOrElseExample {

	public static String orElse() {

		Optional<Student> optional = Optional.ofNullable(null);
		String name = optional.map(Student::getName).orElse("default");
		/*
		 * String name =Optional.ofNullable(StudentDataBase.studentSupplier.get())
		 * .map(Student::getName).orElse("default");
		 */
		return name;
	}

	public static String orElseGet() {
		Optional<Student> optional =Optional.ofNullable(null);
		String name =optional.map(Student::getName).orElseGet(()->"default");

		/*
		 * String name =Optional.ofNullable(StudentDataBase.studentSupplier.get())
		 * .map(Student::getName).orElseGet(()->"default");
		 */

		return name;
	}

	public static String orElseTrhwow() {
		Optional<Student> optional =Optional.ofNullable(null);
		String name =optional.map(Student::getName).orElseThrow(()-> new RuntimeException("Data not available"));

		/*
		 * String name =Optional.ofNullable(StudentDataBase.studentSupplier.get())
		 * .map(Student::getName). orElseThrow(()-> new
		 * RuntimeException("Data not available"));
		 */
		return name;
	}

	public static void main(String[] args) {
		//System.out.println(orElse());
		//System.out.println(orElseGet());
		System.out.println(orElseTrhwow());

	}

}
