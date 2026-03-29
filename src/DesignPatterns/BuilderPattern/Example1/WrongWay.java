package DesignPatterns.BuilderPattern.Example1;

// You need to design a User Profile system where users have various attributes like:
// Required: id, name, email
// Optional: age, qualification, address

class Profile {
    int id;
    String name;
    String email;
    int age;
    String qualification;
    String address;

    Profile(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    Profile(int id, String name, String email, int age){
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    Profile(int id, String name, String email, int age, String qualification){
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.qualification = qualification;
    }

    Profile(int id, String name, String email, String qualification, String address){
        this.id = id;
        this.name = name;
        this.email = email;
        this.qualification = qualification;
        this.address = address;
    }

    Profile(int id, String name, String email, int age, String qualification, String address){
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.qualification = qualification;
        this.address = address;
    }
}

public class WrongWay {
    public static void main(String[] args) {
        // wrong solution is to create multiple constructor each with a possible way of creating object
    }
}
