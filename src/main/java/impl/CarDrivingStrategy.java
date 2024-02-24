package src.main.java.impl;

import src.main.java.interfaces.DriveStrategy;

public class CarDrivingStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving a car!!");
    }
}
