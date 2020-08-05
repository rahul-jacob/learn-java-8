package com.xyz.raul.biconsumer.dilip;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.xyz.raul.data.dilip.Student;
import com.xyz.raul.data.dilip.StudentDatabase;

public class BiConsumerStudent {

	public static Consumer<String> displayName = name -> System.out.println(name);
	public static Consumer<List<String>> displayActivity = list -> list.forEach(System.out::println);
	public static void main(String[] args) {
		List<Student> studentList = StudentDatabase.getAllStudents();
		
		BiConsumer<String,List<String>> displayNameAndActivity = (studObj,activityList) ->{
			displayName.accept(studObj);
			displayActivity.accept(activityList);
		};
		
		studentList.forEach(stud ->displayNameAndActivity.accept(stud.getName(), stud.getActivities()));

	}

}
