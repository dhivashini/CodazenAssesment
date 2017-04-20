package com.dhiva.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import com.dhiva.solution.Course;
import com.dhiva.solution.Student;
import com.dhiva.solution.StudentsEnrolledInCourses;

public class StudentsEnrolledInCoursesTest {
	@Test
	public void test1() {
		Student s1 = new Student("George", "Washington", 23);
		Student s2 = new Student("John", "Adams", 25);
		Student s3 = new Student("Thomas", "Jefferson", 27);
		Course c1 = new Course();
		Course c2 = new Course();
		c1.addStudentToCourse(s1);
		c1.addStudentToCourse(s2);
		c2.addStudentToCourse(s1);
		c2.addStudentToCourse(s3);
		StudentsEnrolledInCourses obj = new StudentsEnrolledInCourses();
		int result = obj.findCommonStudents(c1, c2);
		int expected = 1;
		assertEquals(result, expected);
	}

	@Test
	public void test2() {
		Student s1 = new Student("George", "Washington", 23);
		Student s2 = new Student("John", "Adams", 25);
		Student s3 = new Student("Thomas", "Jefferson", 27);
		Course c1 = new Course();
		Course c2 = new Course();
		c1.addStudentToCourse(s1);
		c1.addStudentToCourse(s2);
		c2.addStudentToCourse(s1);
		c2.addStudentToCourse(s2);
		c2.addStudentToCourse(s3);
		StudentsEnrolledInCourses obj = new StudentsEnrolledInCourses();
		int result = obj.findCommonStudents(c1, c2);
		int expected = 2;
		assertEquals(result, expected);
	}

	@Test
	public void test3() {
		Student s1 = new Student("George", "Washington", 23);
		Student s2 = new Student("John", "Adams", 25);
		Student s3 = new Student("Thomas", "Jefferson", 27);
		Course c1 = new Course();
		Course c2 = new Course();
		c1.addStudentToCourse(s1);
		c1.addStudentToCourse(s2);
		c2.addStudentToCourse(s3);
		StudentsEnrolledInCourses obj = new StudentsEnrolledInCourses();
		int result = obj.findCommonStudents(c1, c2);
		int expected = 0;
		assertEquals(result, expected);
	}

	@Test
	public void test4() {
		Course c1 = new Course();
		Course c2 = new Course();
		StudentsEnrolledInCourses obj = new StudentsEnrolledInCourses();
		int result = obj.findCommonStudents(c1, c2);
		int expected = 0;
		assertEquals(result, expected);
	}

	@Test
	public void test5() {
		Student s1 = new Student("George", "Washington", 23);
		Student s2 = new Student("John", "Adams", 25);
		Student s3 = new Student("Thomas", "Jefferson", 27);
		Course c1 = new Course();
		Course c2 = new Course();
		c1.addStudentToCourse(s1);
		c2.addStudentToCourse(s2);
		StudentsEnrolledInCourses obj = new StudentsEnrolledInCourses();
		int result = obj.findCommonStudents(c1, c2);
		int expected = 0;
		assertEquals(result, expected);
	}

	@Test
	public void test6() {
		Student s1 = new Student("George", "Washington", 23);
		Student s2 = new Student("John", "Adams", 25);
		Student s3 = new Student("Thomas", "Jefferson", 27);
		Course c1 = new Course();
		Course c2 = new Course();
		c2.addStudentToCourse(s1);
		c2.addStudentToCourse(s2);
		c2.addStudentToCourse(s3);
		StudentsEnrolledInCourses obj = new StudentsEnrolledInCourses();
		int result = obj.findCommonStudents(c1, c2);
		int expected = 0;
		assertEquals(result, expected);
	}

	@Test
	public void test7() {
		Student s1 = new Student("George", "Washington", 23);
		Student s2 = new Student("John", "Adams", 25);
		Student s3 = new Student("Thomas", "Jefferson", 27);
		Course c1 = new Course();
		Course c2 = new Course();
		c1.addStudentToCourse(s1);
		c2.addStudentToCourse(s1);
		c2.addStudentToCourse(s2);
		c2.addStudentToCourse(s3);
		StudentsEnrolledInCourses obj = new StudentsEnrolledInCourses();
		int result = obj.findCommonStudents(c1, c2);
		int expected = 1;
		assertEquals(result, expected);
	}

	@Test
	public void test8() {
		Student s1 = new Student("George", "Washington", 23);
		Student s2 = new Student("John", "Adams", 25);
		Student s3 = new Student("Thomas", "Jefferson", 27);
		Course c1 = new Course();
		Course c2 = new Course();
		c1.addStudentToCourse(s1);
		c1.addStudentToCourse(s2);
		c1.addStudentToCourse(s3);
		c2.addStudentToCourse(s1);
		c2.addStudentToCourse(s2);
		c2.addStudentToCourse(s3);
		StudentsEnrolledInCourses obj = new StudentsEnrolledInCourses();
		int result = obj.findCommonStudents(c1, c2);
		int expected = 1;
		assertEquals(result, expected);
	}

	@Test
	public void test9() {
		Student s1 = new Student("George", "Washington", 23);
		Student s2 = new Student("John", "Adams", 25);
		Student s3 = new Student("Thomas", "Jefferson", 27);
		Student s4 = new Student("Thomas", "Jefferson", 29);
		Student s5 = new Student("Thomas", "Jefferson", 30);
		Course c1 = new Course();
		Course c2 = new Course();
		c1.addStudentToCourse(s1);
		c1.addStudentToCourse(s3);
		c2.addStudentToCourse(s1);
		c2.addStudentToCourse(s2);
		c2.addStudentToCourse(s3);
		c2.addStudentToCourse(s4);
		StudentsEnrolledInCourses obj = new StudentsEnrolledInCourses();
		int result = obj.findCommonStudents(c1, c2);
		int expected = 2;
		assertEquals(result, expected);
	}

}
