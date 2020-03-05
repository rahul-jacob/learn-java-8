package com.xyz.raul.function.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentRankList {

	public static void main(String[] args) {
		Predicate<String> distinction = mark -> Integer.parseInt(mark)>=80;
		Predicate<String> firstClass = mark -> Integer.parseInt(mark)>=60;
		Predicate<String> secondClass = mark -> Integer.parseInt(mark)>=50;
		Predicate<String> thirdClass = mark -> Integer.parseInt(mark)>=40;
		Predicate<String> failed = mark -> Integer.parseInt(mark)<40;
		Function<Student,Student> computeRank = studObj -> {
			if(distinction.test(studObj.mark)){
				studObj.rank="Destinction";
			}else if(firstClass.test(studObj.mark)){
				studObj.rank="First Class";
			}else if(secondClass.test(studObj.mark)){
				studObj.rank="Second Class";
			}else if(thirdClass.test(studObj.mark)){
				studObj.rank="Third Class";
			}else if(failed.test(studObj.mark)){
				studObj.rank="Failed";
			}
			return studObj;
		};
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Alex", "98"));
		studentList.add(new Student("Tom", "81"));
		studentList.add(new Student("John", "76"));
		studentList.add(new Student("Peter", "56"));
		studentList.add(new Student("Vijay", "46"));
		studentList.add(new Student("Rahul", "39"));
		
		
		//Computing the rank list and Displaying it
		for(Student studObj : studentList){
			computeRank.apply(studObj);
			System.out.println(studObj);
		}

	}

}

class Student{
	String name;
	String mark;
	String rank;
	public Student(String name, String mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return String.format("The student %1s has %2s marks so the corresponding rank is %3s", this.name,this.mark,this.rank);
	}
	
	
	
	
}
