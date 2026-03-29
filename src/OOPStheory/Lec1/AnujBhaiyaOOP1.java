package OOPStheory.Lec1;

class Dog {
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name +" is walking");
    }

    void bark(){
        System.out.println(name +" Dog is Barking");
    }
}

public class AnujBhaiyaOOP1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Kutta";
        d2.bark();
    }
}
