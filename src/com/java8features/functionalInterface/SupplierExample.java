package com.java8features.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class SupplierExample {

	static Supplier<Student> supplier=()->{
		return new Student("Adam",2,3.6, "male",
				Arrays.asList("swimming",
						"basketball","volleyball")); 
	};

	static Supplier<List<Student>> supplier2=()->{
		return StudentDataBase.getAllStudents();
	};

	public static void main(String[] args) {
		System.out.println("get student details "+supplier.get());
		System.out.println("get student details "+supplier2.get());
	}

}
