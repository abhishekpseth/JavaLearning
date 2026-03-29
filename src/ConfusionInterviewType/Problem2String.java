package ConfusionInterviewType;

public class Problem2String {
    public static void main(String[] args) {
        //########################### String ##################################

        // what is the output of following:
        String s = "Ram";
//       // s[0] = 'M';
//
//        System.out.println(s); // answer is error, as String in java is immutable (i.e. cant be changed)
//
        s = "Shyam"; // wont give any error as it creates a new object every time, also slowest for this reason

        s += "Makhan"; // concatenation is also possible here as it creates a new object

        // if you want to modify String you can use this

        String str = "Hello";
        str = str.substring(0, 1) + 'a' + str.substring(2); // Creates a new string
        System.out.println(str);

        //########################### String Builder ##################################

        StringBuilder sb = new StringBuilder("Hello"); // it is mutable (you can modify it)
        sb.setCharAt(1, 'a'); // Modifies the existing object
        System.out.println(sb);

        //########################### String Buffer ##################################

        StringBuffer sb2 = new StringBuffer("Hello"); // Mutable + thread safe
        sb2.setCharAt(1, 'a'); // Modifies the existing object
        System.out.println(sb2);
    }
}
