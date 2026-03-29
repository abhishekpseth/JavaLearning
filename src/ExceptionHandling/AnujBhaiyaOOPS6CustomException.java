package ExceptionHandling;

import java.util.Scanner;

public class AnujBhaiyaOOPS6CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");

        try {
            int age = sc.nextInt();
            if(age > 100){
                throw new MyException("Age greater than 100");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class MyException extends Exception {
    public MyException(String message){
        super(message); // call krega Exception class ko udhr message bhejega
    }
}