package com.vehicles.project;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static com.vehicles.project.Main.checkDiameter;
import static com.vehicles.project.Main.checkPlate;

public class Car extends Vehicle {



	public Car(String plate, String brand, String color) {

		super(plate, brand, color); //this.plate = plate; substituye al super

	}

	public static Car createCar() throws Exception {

			String plate = JOptionPane.showInputDialog("Car plate: (4 numbers, 2 or 3 letters)");
		while (checkPlate(plate) == false) {

			System.out.println("Wrong Plate, must be 4 numbers and 2 or 3 letters.");
			plate =JOptionPane.showInputDialog("Car plate: (4 numbers, 2 or 3 letters)");
			checkPlate(plate);
		}


		String brand = JOptionPane.showInputDialog("Car brand:");
		String color = JOptionPane.showInputDialog("Car color:");


		Car car1 = new Car(plate, brand, color );

		createWheels(car1);

		return car1;
	}

	public static void createWheels(Car car1) throws Exception {

		//Back Wheels
		String backWheels1Brand = JOptionPane.showInputDialog("Back Wheels' brand:");
		double backWheels1Diameter = Double.parseDouble(JOptionPane.showInputDialog("Back Wheels' diameter (0.4 - 4): "));

		while(checkDiameter(backWheels1Diameter)==false){

			System.out.println("Diameter must be between 0.4 and 4. Try Again.");
			backWheels1Diameter = Double.parseDouble(JOptionPane.showInputDialog("Back Wheels' diameter (0.4 - 4): "));
			checkDiameter(backWheels1Diameter);
		}

		String backWheels2Brand = backWheels1Brand;
		double backWheels2Diameter = backWheels1Diameter;


		Wheel backWheel1 = new Wheel(backWheels1Brand, backWheels1Diameter);
		Wheel backWheel2 = new Wheel(backWheels2Brand, backWheels2Diameter);


		List<Wheel> backWheels = new ArrayList<>();

		backWheels.add(backWheel1); //añade las ruedas traseras a la lista backWheels
		backWheels.add(backWheel2);

		//Front Wheels
		String frontWheels1Brand = JOptionPane.showInputDialog("Front Wheels' Brand:");
		double frontWheels1Diameter = Double.parseDouble(JOptionPane.showInputDialog("Front Wheels' Diameter (0.4 - 4): "));

		while(checkDiameter(frontWheels1Diameter)==false){

			System.out.println("Diameter must be between 0.4 and 4. Try Again.");
			frontWheels1Diameter = Double.parseDouble(JOptionPane.showInputDialog("Front Wheels' diameter (0.4 - 4): "));
			checkDiameter(frontWheels1Diameter);
		}

		String frontWheels2Brand = frontWheels1Brand;
		double frontWheels2Diameter = frontWheels1Diameter;

		Wheel frontWheel1 = new Wheel(frontWheels1Brand, frontWheels1Diameter);
		Wheel frontWheel2 = new Wheel(frontWheels2Brand, frontWheels2Diameter);

		List<Wheel> frontWheels = new ArrayList<>();

		frontWheels.add(frontWheel1); //añade las ruedas delanteras a la lista frontWheels
		frontWheels.add(frontWheel2);

		//añadir las 4 ruedas a la lista wheels de vehicles
		car1.addWheels(frontWheels, backWheels); //metodo para añadir las ruedas al Array Wheels general de Vehicle
	}

	public void addWheels(List<Wheel> backWheels, List<Wheel> frontWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);


		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	public static String getCar(Car car1) {

		return "YOUR CAR->> Plate: "+car1.plate+". Brand: "+car1.brand+". Color: "+car1.color;
	}

}
