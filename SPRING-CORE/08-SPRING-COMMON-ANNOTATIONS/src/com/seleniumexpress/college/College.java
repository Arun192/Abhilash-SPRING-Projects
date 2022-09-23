package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Autowired
	private Principal principal;

	private Teacher teacher;

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

//	public College(Principal principal) {
//
//		this.principal = principal;
//	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setPrincipal");
	}

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("College Class Object test Method..!!");
	}

}
