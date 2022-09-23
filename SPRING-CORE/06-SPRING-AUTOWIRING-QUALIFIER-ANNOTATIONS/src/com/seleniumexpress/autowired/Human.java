package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {


	@Qualifier("octpousHeart")
	@Autowired
	private Heart heart;
//
//
//	public Human(Heart heart) {
//		
//		this.heart = heart;
//	}
//
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("setter method called..!!");
//	}

	public void startPump() {

		if (heart != null) {
			heart.pump();
			System.out.println("name of the animal is :"+ heart.getNameOfAnimal() +"  no. of heart present : "+heart.getNoOfHeart());
		} else {
			System.out.println("You are dead..!!");
		}
	}
}
