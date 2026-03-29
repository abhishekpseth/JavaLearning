package DesignPatterns.FactoryMethod.Example1;

interface Vehicle1 {
    void drive();
}

class Car1 implements Vehicle1 {
    @Override
    public void drive() {
        System.out.println("Drive Car");
    }
}

class Bike1 implements Vehicle1 {
    @Override
    public void drive() {
        System.out.println("Drive Bike");
    }
}

class Truck1 implements Vehicle1 {
    @Override
    public void drive() {
        System.out.println("Drive Truck");
    }
}

class VehicleFactory {
    public static Vehicle1 getVehicle(String vehicleType){
        switch (vehicleType){
            case "Car" : return new Car1();
            case "Bike": return new Bike1();
            case "Truck": return new Truck1();
            default: throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
    }
}

public class CorrectWay {
    public static void main(String[] args) {
        String apiResult = "Truck";

        Vehicle1 vehicle = VehicleFactory.getVehicle(apiResult);
        vehicle.drive();
    }
}
