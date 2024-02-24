package src.main.java.service;

import src.main.java.interfaces.DriveStrategy;

// context class in Strategy design pattern
public class Vehicle {
    DriveStrategy driveStrategy;

    public void setDriveStrategy(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
