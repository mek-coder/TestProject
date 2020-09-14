package com.java.api;

import java.util.Arrays;

public class Student {
	int studentId;
	String studentName;
	String classYear;
	String[] courseInfo;
	
	public Student() {
		
	}
	public Student( int id) {
		super();
		this.studentId = id;
		this.studentName = "Sam";
		this.classYear = "grd 9";
		this.courseInfo =  new String[] {"a","b","c"};
	
	}
	
	public Student( int id, String name, String classTerm, String[] course) {
		super();
		this.studentId = id;
		this.studentName = name;
		this.classYear = classTerm;
		this.courseInfo =  Arrays.copyOf(course, course.length);
	}
	
	public int getStudentid() {
		return this.studentId;
	}
	public void setStudentid(int id) {
		this.studentId = id;;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	
	public String getClassYear() {
		return this.classYear;
	}
	public void setClassYear(String classTerm) {
		this.classYear = classTerm;
	}
	
	public String[] getcourseInfo() {
		return this.courseInfo;
	}
	public void setStudentName(String[] course) {
		this.courseInfo = Arrays.copyOf(course,course.length);
	}
	
}
