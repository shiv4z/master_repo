package com.package2;

public class Car {
	
	public void drive() {
		Engine engine= new Engine();
		int start = engine.start();
		if(start>0) {
			System.out.println("Car started successfully...");
		}else {
			System.out.println("Engine failure..");
		}
		
	}

}
