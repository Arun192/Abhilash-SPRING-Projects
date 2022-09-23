package com.seleniumexpress.di;

public class Student {

	private int id;
	private String studentName;

	public Student(int id) {
		this.id = id;
	}

	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}

	/*
	 * // setter Injection public int getId() { return id; }
	 * 
	 * public void setId(int id) { System.out.println("setter method called : " +
	 * " :setId"); this.id = id; }
	 * 
	 * public String getStudentName() {
	 * 
	 * return studentName; }
	 * 
	 * public void setStudentName(String studentName) {
	 * System.out.println("setter method called : " + " :setName"); this.studentName
	 * = studentName; }
	 */
	public void displayStudentInfo() {
		System.out.println("Student name is  : " + studentName + " and the id is : " + id);
	}

}
