package com.xyz.raul.consumer.dilip;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.xyz.raul.data.dilip.Student;
import com.xyz.raul.data.dilip.StudentDatabase;

public class ConsumerExample {

	public static void main(String[] args) {
		//Printing Student Details 
		System.out.println("-------------------- 1 ---------------------");
		ConsumerExample.printStudentInfo();
		System.out.println("--------------------------------------------");
		//Prints the Student Name and Activities
		System.out.println("-------------------- 2 ---------------------");
		ConsumerExample.printNameAndActivities();
		System.out.println("--------------------------------------------");
		//Prints the Student Name and Activities for all students who is having gpa>=3.9
		System.out.println("-------------------- 3 ---------------------");
		ConsumerExample.printStudentWithGpa(3.9);
		System.out.println("--------------------------------------------");

	}
	
	private static void printStudentWithGpa(double d) {
		Predicate<Student> gpaPredicate = studObj -> studObj.getGpa()>=d;
		Consumer<Student> chkStudentGpa = studObj -> gpaPredicate.test(studObj);
		Consumer<Student> displayName = studObj -> System.out.println("Name is "+studObj.getName());
		Consumer<Student> displayActivity = studObj -> System.out.println("Activities are "+studObj.getActivities());
		List<Student> studList = StudentDatabase.getAllStudents();
		studList.forEach(studObj ->{
			if(gpaPredicate.test(studObj)){
				displayName.andThen(displayActivity).accept(studObj);
			}
		});
	}

	private static void printNameAndActivities(){
		List<Student> studList = StudentDatabase.getAllStudents();
		Consumer<Student> displayName = studObj -> 	System.out.println("Name is "+studObj.getName());
		Consumer<Student> displayActivity = studObj ->System.out.println("Activities are "+studObj.getActivities());
		studList.forEach(displayName.andThen(displayActivity));//Consumer Chaining..
	}

	private static void printStudentInfo(){
		//Access studendData and print details using enhanced for loop.
		List<Student> studList = StudentDatabase.getAllStudents();
		Consumer<Student> displayStudent = studObj -> System.out.println(studObj);
		studList.forEach(displayStudent);
	}
}
