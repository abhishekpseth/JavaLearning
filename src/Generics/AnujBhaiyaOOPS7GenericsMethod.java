package Generics;

public class AnujBhaiyaOOPS7GenericsMethod {
    public static void main(String[] args) {
        printData("Hello");
        printData(123);
        printData(false);

        AnujBhaiyaOOPS7GenericsMethod obj = new AnujBhaiyaOOPS7GenericsMethod();
        obj.<String>printData2("112"); // old way
        obj.printData2(345); // new way
    }

    // generic method, (bina generic class banaye bhi generic method bana skte hai)
    static <E> void printData(E data){
        System.out.println(data);
    }

    <E> void printData2(E data){
        System.out.println(data);
    }

    // bounded generics- kuch limited type hi support krna ho jab
    <E extends Number> void printData2(E data){
        System.out.println(data);
    }
}
