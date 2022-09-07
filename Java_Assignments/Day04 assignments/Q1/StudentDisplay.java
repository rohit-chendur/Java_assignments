package com.sonata.dayfour.q1;

import java.util.ArrayList;
import java.util.List;

public class StudentDisplay {
	List<Student> students = new ArrayList<>();
	public List<Student> getStudent() {
		students.add(new Student(011, "Rishab", 60));
		students.add(new Student(012, "Likhit", 78));
		students.add(new Student(014, "Nandan", 81));
		students.add(new Student(015, "Shreya", 63));
		return students;
	}
	public List<Student>getStudentsSort() {
		List<Student> students = new StudentDisplay().getStudent();
		students.sort((ob1, ob2)-> ob2.getMarks() - ob1.getMarks());
		return students;
	}
	public static void main(String args[]) {
		System.out.println("Before Sorting \n" + new StudentDisplay().getStudent() + "\n");
		System.out.println("After Sorting \n" + new StudentDisplay().getStudentsSort());
	}
}
