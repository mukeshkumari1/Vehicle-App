package src.main.java.service;

import src.main.java.impl.CarDrivingStrategy;

public class Car extends Vehicle{
    public Car(){
        setDriveStrategy(new CarDrivingStrategy());
    }
}
