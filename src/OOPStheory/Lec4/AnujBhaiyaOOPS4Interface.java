package OOPStheory.Lec4;

// Before java 8, interface used to support only abstract method, but now u can also have concrete method in it.
// so how its diff from normal abstract class. Since a class can inherit from multiple class
// but it can implement multiple interfaces


// all methods by default (or implicitly) are public abstract and all fields are public static final

public class AnujBhaiyaOOPS4Interface {
    public static void main(String[] args) {
        // Animal a1  new Animal(); // cant do this as it is inteface which are abstract in nature
        Monkey m = new Monkey();
        m.eats();
        m.sings();
        m.drinks();
    }
}

interface Animal {
//    public static final int legs = 4;

    int legs = 4; // it is same as above public static final

    // interface ke methods apne aap public abstract hote hai likhne ki jarurat ni hai
    void eats();
    void drinks();

    // giving a default implementation, iske subclasses isko override kr skte hai
    // used when 1000's of classes are implementing a interface nd u add one more method to the interface. now u cant
    // implement the method in all the 1000's of classes so we provide a default implementation in interface.
    default void walk(){
        System.out.println("Animal walking");
    }
}

interface Pet {
    void sings();
    void drinks();
}

class Monkey implements Animal, Pet {

    @Override
    public void eats() {
        System.out.println("Monkey eating");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey drinks");
    }

    @Override
    public void sings() {
        System.out.println("Monkey singing");
    }

}