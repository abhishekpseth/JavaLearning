package ConfusionInterviewType;

public class problem1 {
    public static void main(String[] args) {
        // tell the output of following

//        String s1 = new String("Hello");
//        String s2 = new String("Hello");
//
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));


        // see, there are 2 ways to make string

        // 1. using new Keyword, this will use new heap space even if string data is same

        String s1 = new String("Hello");

        // 2. using literals, this will use same heap space(string pool) if string data is same (its optimized)

        String s2 = "Hello";
        String s3 = "Hello";

        //
        System.out.println(s2 == s3); // will result in true as == uses references to compare
        System.out.println(s1.equals(s2)); // will result in true as .equals check data to compare

        // but lets say

        String s4 = new String("Hello");
        String s5 = new String("Hello");

        System.out.println(s4 == s5); // will result in false as diff location in heap memory
        System.out.println(s4.equals(s5)); // will result true as same data
    }
}
