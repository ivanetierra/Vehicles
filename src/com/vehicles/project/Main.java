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
