package com.dhiva.solution;

import java.util.ArrayList;
/*
 * This class is used to add students to a particular course
 */
public class Course {
	private ArrayList<Student> course;
	
	public Course() {
		course = new ArrayList<Student>();
	}
	
	//Method to return the students in a given course
	public ArrayList<Student> getStudents(){
		return this.course;
	}

	//Method to add a student to the course
	public void addStudentToCourse(Student s1) {
		course.add(s1);
	}
}
