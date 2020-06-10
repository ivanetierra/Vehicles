package com.vehicles.project;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String plate = JOptionPane.showInputDialog("Car plate:");
        String brand = JOptionPane.showInputDialog("Car brand:");
        String color = JOptionPane.showInputDialog("Car color:");


        Car car1 = new Car(plate, brand, color );


        //Back Wheels
        String backWheelsBrand = JOptionPane.showInputDialog("Back Wheels' brand:");
        double backWheelsDiameter = Double.parseDouble(JOptionPane.showInputDialog("Back Wheels' diameter: "));

        Wheel backWheelCar1 = new Wheel(backWheelsBrand, backWheelsDiameter);

        ArrayList<Wheel> backWheels = new ArrayList<Wheel>();

        backWheels.add(backWheelCar1);
        backWheels.add(backWheelCar1);


        //Front Wheels
        String frontWheelsBrand = JOptionPane.showInputDialog("Front Wheels' brand:");
        double frontWheelsDiameter = Double.parseDouble(JOptionPane.showInputDialog("Front Wheels' Diameter: "));

        Wheel frontWheelCar1 = new Wheel(frontWheelsBrand, frontWheelsDiameter);

        ArrayList<Wheel> frontWheels = new ArrayList<Wheel>();

        frontWheels.add(frontWheelCar1);
        frontWheels.add(frontWheelCar1);


        System.out.println(car1.getCar());
        System.out.println(car1.getWheels());







    }
}
