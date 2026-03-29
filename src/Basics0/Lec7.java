package Basics0;

public class Lec7 {
    public static void main(String[] args) {
        String name = "Mahesh"; //Double quotes hai to string hoga
        char ch = 'a'; // single quote hai to character hai

        // A string works same as a character array
        // For ex:

        String place = "Mumbai";
        char[] place2 = {'M', 'u', 'm', 'b', 'a', 'i'};

        // How to make a string - 2 ways, using new keyword or Directly

        // way 1:
        String s1 = new String("a"); // basic tareeka jaise object banate hai, now this way has become redundant

        // way 2:
        String s2 = "Anuj"; // ye naya tareeka, this is a optimized way


        // Stack & Heap: These are 2 type of memories in java.
        // Stack Memory: It contains data of primitive data type as well as references of object. So if a string is made with new keyword then stack will hold its reference and not the actual string.
        // Heap Memory: It contains the actual object. So if a string is made with new keyword heap will hold the actual string.

        // When String is  created without new keyword (newer way)
        // Then its value will store in the String Constant Pool (or just, String Pool) which is an specific area assigned in Heap memory only.
        // Now if another string is made (with newer method i.e. without the new keyword) then it will check is there exist any string with this value or not, if yes then it will point to that only and if not then it will create a new value in the string pool.
        // Now lets say i create another string with the same value as above but with new keyword then it will go to heap memory but not in the string pool but outside of it like a normal object. Here if i make another string with same value it will create a new object only.

        // for ex:
        String ex = "example"; // creates a new value in string pool inside heap

        String ex2 = "example"; // points to the above create value only
        String ex3 = new String("example"); // creates a new string object in heap outside the string pool.
        String ex4 = new String("example"); // again creates a new string object in heap outside the string pool.

        // Summary of Stack and Heap Memory:
        // Stack: Pritive datatypes (int, char, boolean etc) and references of object.
        // Heap:
        //      String Pool: String values made without new keyword (String s = "Hello"). Do not contains duplicates, since when another variable is created with same string value then it points to the previously created value only.
        //      Outside: Objects including strings made by new keywords. Can contain duplicates.
        //

        // Immutability of String:

        // Strings are immutable. Immutable simply means unmodifiable and unchangeable.
        // Once a string is created it can't be changed.

        // Ex;

        String s3 = "Anuj";
        s3= "Shivam";
        System.out.println(s3); // Shivam, but why ??? Isn't string immutable ???

        // Actually Strings values aren't immutable but there values immutable.

        // Basically  when s3 was made then the value Anuj got created in String Pool, but when it got assigned to Shivam
        // then another value with Shivam got created in String Pool and now s3 points to that.
        // Now thodi der baad garbage collector aayega vo dekhega ki nobody is referencing anuj to vo use clear kr dega.

        // So basically, once a string object is created its data or
        // state can't be changed.

        // if we do
        s3 = s3 + "Kumar"; // it creates a new value Shivam Kumar in string pool and now s3 points to that.

        // But:

        String s4 = "Hello";
        s4.concat(" World");
        System.out.println(s4);  // Output: Hello

        // 👉 Even though we used concat, s1 is still "Hello".
        // A new String object "Hello World" was created in memory, but s1 still points to "Hello".

        // If we want the change:

        s4 = s4.concat(" World");
        System.out.println(s1);  // Output: Hello World

        // Now, s1 points to the new object. So basically reassign krna padta hai

        // ✅ Summary of Immutability:
        //Strings in Java are immutable → their value can’t change after creation.
        //Any modification results in a new object.
        //This ensures security, performance, thread-safety, and reliability.


        // String Methods:

        String n1 = "Anuj";
        String n2 = "Anuj";
        String n3 = new String("Anuj");

        System.out.println(n1); // Anuj
        System.out.println(n3); // Anuj
        System.out.println("Anuj Kumar"); // bas bana print hua and memory se nikal gaya

        // Equals:

        // for primitive datatype: if(4 == 4) gives me true
        // for strings

        // if(n1 == n2) -> this will be true
        // if(n1 == n3) -> this will be false, even though both are printing Anuj. so Why??

        // when you use == then it compares references and not the actual value.
        // since n1 & n2 are pointing to same value (which is present in string pool)
        // but n3 is pointing to the value present in Heap but not in string pool.
        // So since both the references are pointing to different locations it is giving me false.

        // for primitives
        int age = 14;
        int marks = 14;
        // here both are pointing to different locations but since they are primitive datatype so == will give true.

        // For comparing 2 string with value only (doesnt matter where they are present or the references)

        // .equals method
        s1.equals(s2); // gives true if both their values are some

        // .equalsIgnoreCase method
        s1.equalsIgnoreCase(s2); //since JAVA is case sensitive this method is used to compare string without

        // Some other methods:
        // toUpperCase()
        // toLowerCase()
        // trim()
        // startsWith()
        // endsWith()
        // equals()
        // equalsIgnoreCase()
        // charAt()
        // valueOf()
     }
}
