package com.seleniumexpress.autowired;

public class Human {

	private Heart heart;
	
	

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called..!!");
	}

	public void startPump() {

		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("You are dead..!!");
		}
	}
}
