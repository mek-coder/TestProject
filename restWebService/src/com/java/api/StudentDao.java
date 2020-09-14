package com.java.api;


import java.util.HashMap;
import java.util.Map;

public class StudentDao {
	
	Map<String,Student> studentList = new HashMap<String,Student>();
	int id;
	public StudentDao() {
		super();
		this.intialListStudents();
	}

	public void intialListStudents() {
		
		Student myStudent = new Student(1, "Abby","Grade 10", new String[]{"La2","Ma2","Phy2", "Sp2"});
		studentList.put(Integer.toString(++id), myStudent)	;
		
		 myStudent = new Student(2, "Betty","Grade 10", new String[]{"La2","Ma2","chem2", "Sp2"});
		studentList.put(Integer.toString(++id), myStudent)	;
		
		 myStudent = new Student(3, "Cal","Grade 10", new String[]{"La2","Ma2","Bio2", "Sp2"});
		studentList.put(Integer.toString(++id), myStudent)	;
		
	}
	
	public void addStudent(Student myStudent) {
		studentList.put(Integer.toString(++id), myStudent)	;
	}
	

	public Map<String,Student> getStudents() {
		return studentList;
	}


}
