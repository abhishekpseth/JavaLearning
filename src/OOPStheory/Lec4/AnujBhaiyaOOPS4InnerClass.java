package OOPStheory.Lec4;

public class AnujBhaiyaOOPS4InnerClass {
    class Toy {
        int price;
    }

    static class Playstation {
        int price;
    }

    public static void main(String[] args) {
        // Toy toy = new Toy(); // now allowed since its a static method and u cant use non static class in static method
        // toy.price; // not allowed

        // write it like thhis

        // method 1:
        AnujBhaiyaOOPS4InnerClass obj = new AnujBhaiyaOOPS4InnerClass();
        Toy toy1 = obj.new Toy();
        toy1. price = 45;

        // method 2:
        Toy toy2 = new AnujBhaiyaOOPS4InnerClass().new Toy();
        toy2.price = 30;

        // now using static class

        Playstation playstation = new Playstation();
        playstation.price = 55;
    }
}
