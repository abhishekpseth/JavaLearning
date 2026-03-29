package Generics;

public class AnujBhaiyaOOPS7GenericandWrapperClasses {
    public static void main(String[] args) {
        Integer obj = new Integer(12); // old way

        Integer obj2 = Integer.valueOf(12); // recommended

        Integer obj3 = 12; // more recommended.. uses autoboxing

        int age = obj; // unboxing

        // Why wrapper class ?
        // for ex we need it in cases like below
        // ArrayList<int> a = new ArrayList<>(); this is not allowed so we have to use Integer here instead of int

        Boolean myBoolean = Boolean.valueOf(false); //this will work
        Boolean myBoolean2 = Boolean.valueOf("true"); //this will also work


    }
}
