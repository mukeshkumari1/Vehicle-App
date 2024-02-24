package src.main.java.service;

import src.main.java.impl.CarDrivingStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        setDriveStrategy(new CarDrivingStrategy());
    }
}
