package com.java8features.streams;

import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamFindAnyExample {
	public static Optional<Student> findMatch(){
		return StudentDataBase.getAllStudents().stream().
				filter(s->s.getGpa()>=3.9).
				findFirst();
	}
	public static Optional<Student> findAny(){
		return StudentDataBase.getAllStudents().stream().
				filter(s->s.getGpa()>=3.9).
				findAny();
	}
	public static void main(String[] args) {
		System.out.println("findMatch "+findMatch());
		System.out.println("findAny "+findAny());
	}

}
