package com.vehicles.project;

import javax.swing.*;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {

		super(plate, brand, color);
	}

	public static Bike createBike() throws Exception {

		String plate = JOptionPane.showInputDialog("Bike plate: (4 numbers, 2 or 3 letters)");

		while (checkPlate(plate) == false) {

			System.out.println("Wrong Plate, must be 4 numbers and 2 or 3 letters.");
			plate =JOptionPane.showInputDialog("Bike plate: (4 numbers, 2 or 3 letters)");
			checkPlate(plate);
		}
		String brand = JOptionPane.showInputDialog("Bike brand:");
		String color = JOptionPane.showInputDialog("Bike color:");

		Bike bike1 = new Bike(plate, brand, color );

		createWheels(bike1);

		return bike1;
	}

	public static void createWheels(Bike bike1) throws Exception {

		//Back Wheel
		String backWheelBrand = JOptionPane.showInputDialog("Back Wheel brand:");
		double backWheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Back Wheel's diameter (0.4 - 4): "));

		while(checkDiameter(backWheelDiameter)==false){

			System.out.println("Diameter must be between 0.4 and 4. Try Again.");
			backWheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Back Wheel's diameter (0.4 - 4): "));
			checkDiameter(backWheelDiameter);
		}

		Wheel backWheel = new Wheel(backWheelBrand, backWheelDiameter);



		//Front Wheel
		String frontWheels1Brand = JOptionPane.showInputDialog("Front Wheel Brand:");
		double frontWheels1Diameter = Double.parseDouble(JOptionPane.showInputDialog("Front Wheel's Diameter (0.4 - 4): "));

		while(checkDiameter(frontWheels1Diameter)==false){

			System.out.println("Diameter must be between 0.4 and 4. Try Again.");
			backWheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Front Wheel's diameter (0.4 - 4): "));
			checkDiameter(backWheelDiameter);
		}

		Wheel frontWheel = new Wheel(frontWheels1Brand, frontWheels1Diameter);



		bike1.addBikeWheels(frontWheel, backWheel); //metodo para añadir las ruedas al Array Wheels general de Vehicle
	}

	public void addBikeWheels(Wheel backWheel, Wheel frontWheel) throws Exception {
		this.wheels.add(backWheel);
		this.wheels.add(frontWheel);
	}



	public static String getBike(Bike bike1) {

		return "YOUR BIKE->> Plate: "+bike1.plate+" Brand: "+bike1.brand+" Color: "+bike1.color;
	}
}
