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

	public static boolean checkPlate(String plate) { //devuelve si la matricula es valida o no

		boolean result;

		int numbers = 0;
		int letters= 0;

		for (int i = 0; i < plate.length(); i++) {

			char c = plate.charAt(i);

			if (Character.isDigit(c)) {
				numbers++;
			} else if(Character.isLetter(c)) {
				letters++;
			}
		}

		if ((numbers == 4 && (letters == 2 || letters == 3))) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public static boolean checkDiameter(double diameter) { // devuelve si el diametro es valido o no
		boolean result;

		if (diameter >= 0.4 && diameter <= 4) {
			result = true;
		}else{
			result = false;
		}
		return result;
	}
}
