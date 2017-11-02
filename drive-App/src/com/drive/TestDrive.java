package com.drive;

import com.drive.car.Car;
import com.drive.wheel.CEATWheel;
import com.drive.wheel.MRFWheel;

public class TestDrive {

	public static void main(String[] args) {

		Car car = new Car();

		// ------------------------------------
		MRFWheel mrfWheel = new MRFWheel();
		CEATWheel ceatWheel = new CEATWheel();
		// ------------------------------------

		car.setWheel(mrfWheel);

		// ------------------------------------

		System.out.println("-------------");
		car.move();
		System.out.println("-------------");
		car.move();

	}

}
