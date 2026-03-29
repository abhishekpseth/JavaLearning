package InterviewQuestions.CodingProblems;

//  You are given a list of n students, each with a name and marks (out of 100). Your task is to:
//  Take n as input (number of students).
//  Take n student details as input (name and marks).
//  Sort the students in descending order of marks (if two students have the same marks, sort alphabetically by name).
//  Print the sorted list in the format:

// Example Input:
//    5
//    Alice 85
//    Bob 92
//    Charlie 85
//    David 78
//    Eve 92

// Expected Output:
//    Bob - 92
//    Eve - 92
//    Alice - 85
//    Charlie - 85
//    David - 78

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}

class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline

        ArrayList<Student> students = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int marks = sc.nextInt();
            sc.nextLine();  // Consume the leftover newline after nextInt()

//            System.out.println("hi: " + name + " " + marks);

            students.add(new Student(name, marks));
        }

        // Sorting logic (if needed)
        students.sort((s1, s2) -> {
            if (s1.marks != s2.marks) {
                return s2.marks - s1.marks;  // Descending order of marks
            }
            return s1.name.compareTo(s2.name);  // Alphabetical order if marks are the same
        });

        // Printing sorted students
        for (Student student : students) {
            System.out.println(student.name + " - " + student.marks);
        }
    }
}
