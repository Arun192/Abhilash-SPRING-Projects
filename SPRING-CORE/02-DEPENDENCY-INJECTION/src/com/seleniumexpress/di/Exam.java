package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		  /*  Student arun = context.getBean("student" , Student.class);
		  arun.displayStudentInfo();
		 */
		  
	Student arun =context.getBean("student" ,Student.class);
	arun.displayStudentInfo();
	
	Student dilip = context.getBean("dilip" , Student.class);
		dilip.displayStudentInfo();
	}
}
