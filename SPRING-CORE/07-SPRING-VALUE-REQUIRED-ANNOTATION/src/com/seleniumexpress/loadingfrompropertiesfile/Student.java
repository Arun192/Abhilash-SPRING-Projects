package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	private String name;
	
	@Value("${student.intrestedCourse}")
	private String intrestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;

	
/*
	@Required
	@Value("${student.intrestedCourse}")
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}

	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
*/
	public void displayStudentInfo() {
		System.out.println("Student name : " + name);
		System.out.println("Student course : " + intrestedCourse);
		System.out.println("Student hobby : " + hobby);
	}


}
