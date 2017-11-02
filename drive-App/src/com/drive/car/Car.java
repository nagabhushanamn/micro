package com.drive.car;

import com.drive.wheel.Wheel;

public class Car {

	private Wheel wheel;

	public Car() {
		System.out.println("New car created...");
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
		System.out.println("Wheel assembled...");
	}

	public void move() {
		wheel.rotate();
		System.out.println("Car moving...");

	}

}
