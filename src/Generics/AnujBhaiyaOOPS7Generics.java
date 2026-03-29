package Generics;

public class AnujBhaiyaOOPS7Generics {
    public static void main(String[] args) {
        Dog1<String, String> d1 = new Dog1<String, String>("1234", "Naman"); // old method

        Dog1<Integer, String> d2 = new Dog1<>(1234, "Naman"); // newer method.. idhr primitive data type ni dal skte only wrapper class

        System.out.println(d2.getId());
    }
}

// using generics we can use variable with custom data types, these data types are sent as parameters
class Dog1<E, P> {
    E id;
    P name;

    public Dog1(E id, P name){
        this.id = id;
        this.name = name;
    }

    E getId(){
        return id;
    }
}