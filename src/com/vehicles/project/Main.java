package com.vehicles.project;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        String userVehicle = JOptionPane.showInputDialog("create car or bike?");
        userVehicle.toLowerCase();

        switch (userVehicle) {

            case "bike":
                Bike bike1 = Bike.createBike();
                System.out.println(Bike.getBike(bike1));
                System.out.println("BIKE "+Bike.getWheels());

                break;

            case "car":
                Car car1= Car.createCar();
                System.out.println(Car.getCar(car1));
                System.out.println("CAR "+Car.getWheels());

                break;

            default:
                System.out.println("Can't create this vehicle.");
        }
    }
}
