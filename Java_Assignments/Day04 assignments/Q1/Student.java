package com.sonata.dayfour.q1;

public class Student {
	private int stdID;
	private String stdName;
	private int marks;
	public Student(int id, String name, int marks) {
		this.stdID = id;
		this.stdName = name;
		this.marks = marks;
	}
	public int getStdID() {
		return stdID;
	}
	public void setStdID(int stdID) {
		this.stdID = stdID;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
