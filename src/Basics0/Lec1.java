package Basics0;

import java.util.Scanner;

public class Lec1 {
    public static void main(String[] args) {
        // 1. -------- 👉 Keywords shouldn't be used for making identifiers (classes, variables etc.) --------

        // 2. -------- Rules for naming variables --------
            // 1. Java is case-sensitive. age and AGE are different.
            // 2. Variables must start from a letter or underscore, dollar sign. It can't start from a number.
            // 4. Variable names cant includes whitespace.
            // 5. Variable names cant be keywords.
            // 6. Variable name should be in camelCase. (not a rule but standard practice).

        // 6. -------- float vs decimal --------
            // float: stores 6 to 7 decimal digits.
            // double: stores up to 15 decimal digits.

            //  float pi = 3.14f; // by default it makes the variable double only, use f for strictly making it float
            //  double secondPi = 3.14;
            //
            //  System.out.println(pi); // 3.14 -> since it is stored with this precision only
            //  System.out.println(secondPi); // 3.14 -> since it is stored with this precision only

            // float thirdPi = 3.142856142856142856142856142856142856f
            // System.out.println(thirdPi); -> 3.1428561 -> only 7 decimal digits will be visible

        // 7. -------- 👉 Java runs top to down. It doesnt do hoisting like js. --------

        // 8. -------- Datatype conversions --------
            //      Implicit: Also called direct or widening. It can be done directly with no extra efforts. Its similar to storing a short fish in large pool.
            //          int count = 12;
            //          long count2 = count; can be done without any issue.
            //      Explicit: Similar to storing a large fish in small pool.
            //          long count = 12;
            //          int count2 = (int)count; directly allowed nhi h but explicitly bol skte ho
            //
            //          int age = 150;
            //          byte newAge = (byte)age; -> will give -106 value (-128 + (150-128)) as it is lossy conversion since byte only allows from -128 to +127
            //          if we don't mention explicitly then we get a compile time error.


        // Basic

        // The Scanner class (in java.util) reads input as tokens from an input stream (like System.in).
        // By default, tokens are separated by whitespace (spaces, tabs, newlines).
        // Different methods read tokens in different ways:

        Scanner sc = new Scanner(System.in);

        //        | Method         | Reads...                                                        |
        //        | -------------- | --------------------------------------------------------------- |
        //        | `nextInt()`    | The next integer token only (leaves the newline in the buffer). |
        //        | `next()`       | The next token (word), stopping at whitespace.                  |
        //        | `nextLine()`   | The whole line (until you hit Enter, **including spaces**).     |
        //        | `nextDouble()` | The next double token.                                          |
        //        | `hasNextInt()` | Checks if the next token can be read as an int.                 |

        int val = sc.nextInt();
        String firstName = sc.nextLine();
        String lastName = sc.next();

        System.out.println("val: "+val+" firstName: "+firstName+" lastName: "+lastName);
        //        4
        //        abhishek
        //        val: 4 firstName:  lastName: abhishek

        // why this behaviour ???

        // 👉 Problem: After nextInt(), you press Enter, which puts a newline \n in the buffer.
        // nextLine() immediately consumes that newline, so firstName becomes an empty string "".

        int val2 = sc.nextInt();
        sc.nextLine();  // consume leftover newline

        String firstName2 = sc.nextLine();
        String lastName2 = sc.next();

        // Best practices :
        // 1. Always add a sc.nextLine(); after numeric input to consume the newline.
        // 2. When reading full names or sentences, Use nextLine(), not next().
        // 3. Check before reading.
            if (sc.hasNextInt()) {
                int x = sc.nextInt();
            }
        // 4. Always close Scanner when done
            sc.close();

        // ✅ Summary:
        //  next() → single word.
        //  nextLine() → full line.
        //  nextInt(), nextDouble() → leave newline behind, so use sc.nextLine() after them.
    }
}
