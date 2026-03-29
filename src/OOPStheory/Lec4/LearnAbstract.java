package OOPStheory.Lec4;

abstract class Vehicle {
    abstract void accelarate();
    abstract int brakes(int wheels);
    void honks(){
        System.out.println("vehicle honks");
    }
}

class Car extends Vehicle {
    @Override
    void accelarate() {
        System.out.println("car is accelerating");
    }

    @Override
    int brakes(int wheels) {
        System.out.println("car brakes are pushed");
        return 0;
    }

    @Override
    void honks() {
        System.out.println("car is honking");
    }
}

public class LearnAbstract {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.accelarate();
        c1.brakes(4);
        c1.honks();
    }
}
