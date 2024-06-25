package com.java8features.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamGroupingByExample {

	public static void groupingByGender() {

		Map<String, List<Student>> studentsByGender= StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println(studentsByGender);
	}

	public static void customGrouping() {

		Map<String, List<Student>> studentsByGender= StudentDataBase.getAllStudents().
				stream()
				.collect(Collectors.groupingBy(s->s.getGpa()>=3.8?"OUTSTANDING":"AVERAGE"));

		System.out.println(studentsByGender);
	}

	public static void main(String[] args) {
		//groupingByGender();
		//customGrouping();
		System.out.println(Runtime.getRuntime().availableProcessors());

	}

}
