package Basics;

import java.util.Scanner;

public class AnujBhaiya1 {
    public static void main(String[] args) {
        // printing
        System.out.println("im Abhishek");

        // input
        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();

//        System.out.println(age);

        // conditional statement
        int weight = 60;

        if(weight < 80){
            System.out.println("Not overweight");
        }else{
            System.out.println("Overweight");
        }

        // Ternary operator
        int height = 6;

        boolean hot = height >= 6 ? true : false;
        System.out.println("Is hot: " + hot);

        // Switch statement

//        int day = sc.nextInt();
//
//        switch (day){
//            case 1:
//                System.out.println("Monday"); break;
//
//            case 2:
//                System.out.println("Tuesday"); break;
//
//            case 3:
//                System.out.println("Wednesday"); break;
//
//            case 4:
//                System.out.println("Thursday"); break;
//
//            case 5:
//                System.out.println("Friday"); break;
//
//            case 6:
//                System.out.println("Saturday"); break;
//
//            case 7:
//                System.out.println("Sunday"); break;
//
//            default:
//                System.out.println("No option");
//        }

        // Array
            int[] marks = new int[5];

            marks[0] = 10;
            marks[1] = 11;
            marks[2] = 12;
            marks[3] = 13;
            marks[4] = 14;

            for(int i=0; i<5; i++){
                System.out.println("marks "+i+" is "+ marks[i]);
            }

            String[] names = {"Ram", "Shyam", "Balram", "Ghanshyam"};

            for(String name: names){
                System.out.print(name+" ");
            }
    }
}
