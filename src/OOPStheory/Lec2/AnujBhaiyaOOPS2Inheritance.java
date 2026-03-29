package OOPStheory.Lec2;

class Vehicle {
    int wheelsCount;
    String model;
    final int gears = 10; // value will never be change

    Vehicle(){
        System.out.println("Vehicle created");
    }

    Vehicle(int wheels){
        System.out.println("Creating vehicle with "+wheels+" wheels");
    }

    void start(){
        System.out.println("vehicle is starting");
    }

    void accelarate(){
        System.out.println("make the method final, that means you cant change it upon inheritance");
    }
}

class Car extends Vehicle {
    Car(){
        super(4);
        System.out.println("car created");
    }
}

public class AnujBhaiyaOOPS2Inheritance {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.model = "i10";
        obj.start();
    }
}
