package com.package1;

public class Car extends Engine{
	
	public void drive() {
		int start = super.start();
		if(start>0) {
			System.out.println("Car strated successfully....");
		}else {
			System.out.println("Engine faiilure...");
		}
	}

}
