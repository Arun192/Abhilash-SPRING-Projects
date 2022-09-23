package com.seleniumexpress.ioc;

public class Vodafone implements Sim{

	@Override
	public void calling() {
	System.out.println(" Calling using vodafone mobile");
		
	}

	@Override
	public void data() {
		System.out.println(" Browsing using vodafone data");

	}

}
