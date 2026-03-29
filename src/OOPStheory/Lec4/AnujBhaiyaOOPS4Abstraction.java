package OOPStheory.Lec4;

public class AnujBhaiyaOOPS4Abstraction {
    public static void main(String[] args) {
       // Vehicle2 v1 = new Vehicle2(); // will give error cz vehicleClass is abstract
        Car2 c = new Car2();
        c.accelarate();
        c.brakes(4);
        c.honks();
    }
}

// abstract method doesnt have a body, abstract class cant be instatiated but we can create subclass from it.
// each non-abstract child of the abstract class has to implement all the abstract method of that abstract class.
// abstract method must be inside abstract class only.. vice versa is not true (i.e. abstract class cam have both abstrac and nonabstract methods).

abstract class Vehicle2{
    abstract void accelarate();
    abstract int brakes(int wheels);

    void honks(){  // concerete method
        System.out.println("Vehicle Honks");
    }
}

class Car2 extends Vehicle2 {

    @Override
    void accelarate() {
        System.out.println("Car is accelarating");
    }

    @Override
    int brakes(int wheels) {
        System.out.println("Car brakes are pushed");
        return wheels;
    }

    void honks(){
        System.out.println("Car Honks");
    }
}

