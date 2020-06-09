package com.vehicles.project;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String plate = JOptionPane.showInputDialog("Car plate:");
        String brand = JOptionPane.showInputDialog("Car brand:");
        String color = JOptionPane.showInputDialog("Car color:");


        Car car1 = new Car(plate, brand, color );

        String brandWheel = JOptionPane.showInputDialog("Wheel brand:");
        double diameter = Double.parseDouble(JOptionPane.showInputDialog("Diameter"));

        Wheel wheelCar1 = new Wheel(brandWheel, diameter);



    }
}
