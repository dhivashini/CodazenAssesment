package com.dhiva.solution;

import java.util.HashMap;
/*
 * This class is used to find the number of students common between two courses
 */
public class StudentsEnrolledInCourses {
	private HashMap<Student, Integer> map;
	private int result;

	public StudentsEnrolledInCourses() {
		this.map = new HashMap<>();
	}
	
	/*
	 * Method to find common students in two courses, with two arguments which are two courses.
	 * Time complexity O(n+n), Space complexity for HashMap - O(n), where n is the number of students in a course
	 */
	public int findCommonStudents(Course course1, Course course2) {
		for (Student current : course1.getStudents()) {
			map.put(current, 1);
		}

		for (Student current : course2.getStudents()) {
			if (map.containsKey(current))
				result++;
		}
		return result;
	}

}
