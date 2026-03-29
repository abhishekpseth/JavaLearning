package DesignPatterns.FactoryMethod.Example1;

class Vehicle {
    void drive(){
        System.out.println("Drive Vehicle");
    }
}

class Car extends Vehicle {
    void drive(){
        System.out.println("Drive Car");
    }
}

class Bike extends Vehicle {
    void drive(){
        System.out.println("Drive Bike");
    }
}

class Truck extends Vehicle {
    void drive(){
        System.out.println("Drive Truck");
    }
}

public class WrongWay {
    public static void main(String[] args) {
        String apiResult = "Bike";

        Vehicle vehicle;
        if(apiResult.equals("Car")){
            vehicle = new Car();
        }else if(apiResult.equals("Bike")){
            vehicle = new Bike();
        }else{
            vehicle = new Truck();
        }

        vehicle.drive();
    }
}
