package Basics;

public class AnujBhaiya2 {
    public static void greet(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
//        greet();

        int a=2;
        int b=3;

//        System.out.println(Math.max(a,b));

        String name = "Anuj";
        String name2 = "Anuj"; // stores at same location as name
        String name3 = new String("Anuj"); // stores in new space in heap

        // comparing string
        if(name == name2){
            System.out.println("name and name2 are same");
        }else{
            System.out.println("name and name2 are different");
        }

        if(name == name3){
            System.out.println("name and name3 are same");
        }else{
            System.out.println("name and name3 are different");
        }

        // == references check krte hai object k case me (string are object) string is non primitive data type
        // string match krne k liye .equals method use kr skte hai

        if(name.equals(name3)){ // match value - case sensitive.. for case insenstive use method equalsIgnoreCase
            System.out.println("name and name3 are same");
        }else{
            System.out.println("name and name3 are different");
        }
    }
}
