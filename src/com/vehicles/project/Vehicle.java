package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected static List<Wheel> wheels = new ArrayList<>();

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}

	public static String getWheels() {

		//print for
		String text = "";
		for (Wheel i : wheels ) {
			text += i.getWheel()+" ";
		}
		return "WHEELS->> "+text;
	}

}
