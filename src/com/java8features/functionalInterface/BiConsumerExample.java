package com.java8features.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class BiConsumerExample {

	static BiConsumer<String,
	List<String>> biConsumer1=(a,b)->System.out.println(a+" : "+b);

	static void nameAndActivities() {
		List<Student> students= StudentDataBase.getAllStudents();
		students.forEach(student->{
			biConsumer1.accept(student.getName(), student.getActivities());	
		});
	}



	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer=
				(a,b)->System.out.println("a: "+a+", b: "+b);
				biConsumer.accept("java8", "java9");

				BiConsumer<Integer,Integer> multi=(a,b)->System.out.println("multiplication :"+a*b);
				BiConsumer<Integer,Integer> division=(a,b)->System.out.println("division :"+a/b);

				multi.andThen(division).accept(10, 5);
				
				nameAndActivities();








	}

}
