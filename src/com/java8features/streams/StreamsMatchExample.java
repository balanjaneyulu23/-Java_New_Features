package com.java8features.streams;

import com.learnJava.data.StudentDataBase;

public class StreamsMatchExample {

	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream().allMatch(s->s.getGpa()>=3.5);
	}

	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream().anyMatch(s->s.getGpa()>=4);
	}

	public static boolean nonMatch() {
		return StudentDataBase.getAllStudents().stream().noneMatch(s->s.getGpa()>=4.1);
	}

	public static void main(String[] args) {
		System.out.println("All match example : "+allMatch());
		System.out.println("Any match example : "+anyMatch());
		System.out.println("nonMatch  example : "+nonMatch());
	}

}
