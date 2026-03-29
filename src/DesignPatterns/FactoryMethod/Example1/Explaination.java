package DesignPatterns.FactoryMethod.Example1;

public class Explaination {
    public static void main(String[] args) {
        // Factory method is a creational desingn pattern
        // this is used when we want to lets say dynamically create a object. like for example an api can give result
        // Car, Bike, Truck, now whatever is the result we have to make a object of it. for this, what we do it we create
        // an interface (of result like Vehicle in this case) and all the classes (Car, Bike, Truck) will implement it
        // now we will use a static method of a factory class which will return a object according to the parameter passed.

    }
}
