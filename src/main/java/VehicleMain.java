package src.main.java;

import src.main.java.impl.BikeDrivingStrategy;
import src.main.java.service.Car;
import src.main.java.service.Vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.drive();

        Vehicle bike = new Vehicle();
        bike.setDriveStrategy(new BikeDrivingStrategy());
        bike.drive();

    }
}
