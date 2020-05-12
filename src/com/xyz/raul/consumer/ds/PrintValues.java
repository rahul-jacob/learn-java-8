package com.xyz.raul.consumer.ds;

import java.util.List;
import java.util.function.Consumer;

import com.xyz.raul.pojo.Student;
import com.xyz.raul.util.Java8Util;

public class PrintValues {

	public static void main(String[] args) {
		List<Student> studList = Java8Util.getStudents();
		Consumer<Student> displayConsumer = (obj) -> {
				System.out.println(obj);
		};
		//Display using consumer i/p
		studList.forEach((stud) ->{
			displayConsumer.accept(stud);
		});
	}

}
