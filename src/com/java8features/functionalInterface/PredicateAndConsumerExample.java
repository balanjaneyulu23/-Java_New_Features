package com.java8features.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateAndConsumerExample {

	Predicate<Student> p1=s->s.getGradeLevel()>=3;
	Predicate<Student> p2=s->s.getGpa()>=3.9;

	BiPredicate<Integer, Double> biPredicate= (a,b)->a>=3 && b>=3.9; 

	BiConsumer<String , List<String>> biConsumer=(a,b)->System.out.println(a+" :  "+b);

	Consumer<Student> consumer=student->{
		if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
			biConsumer.accept(student.getName(), student.getActivities());
		}
	};


	public void printNameAndActivities(List<Student> students) {
		students.forEach(consumer);
	}

	public static void main(String[] args) {
		new PredicateAndConsumerExample().printNameAndActivities(StudentDataBase.getAllStudents());

	}

}
