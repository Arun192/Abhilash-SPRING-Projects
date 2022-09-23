package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Beans is Loaded..!!");
		
		Student student = context.getBean("student" , Student.class);
		
		System.out.println(student);
		student.displayStudentInfo();
	}
}
