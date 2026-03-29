package Basics;

public class StringsAndStringBuilder {
    public static void main(String[] args) {
        // 1. String declaration me S capital hota hai
        // 2. Length of string: s.length()
        // 3. charater at any index: s.charAt(i)
        // 4. check if string equal: s1.equals(s2)
        // 5. equal but ignore case: s1.equalsIgnoreCase(s2)
        // 6. compare strings (by ascii): s1.compareTo(s2)  // so s1: remote and s2: ramote hai to 101 - 97 = 4 aayega, it consider cae too, since ascii of capital and small letters are diff
        // 7. substring: s.substring(i) , here i is the beginning index, s.substring(i, j) [i,j) i se j tk j excluded
        // 8. uppercase: s.toUpperCase()
        // 9. lowercase: s.toLowerCase()
        // 10. trim for extra spaces in begin and last: s.trim()
        // 11. Replace: s.repace(target, replacement)
        // 12. startswith: s1.startsWith(s2)
        // 13. isEmpty (no whitespace) : s.isEmpty()
        // 14. empty with whitespace: s.isBlank()
        // 15. index of: s.indexOf("a") , get first index of matching character
        // 16. last index of: s.lastIndexOf
        // 17. String.valueOf(a) // here a is integer
        // 18. String.format("My name is %s and I am %d years old", "John", 25);
        // 19. java me s.substring and s.subsequence same cheez return krta hai


        // ------------------ String vs String Builder vs String Buffer ------------

        // ################################## String ##################################

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

        // ---------------------------------------------------------------------------------

        String s1 = "Hello";
        String s2 = s1.concat("World");
        System.out.println(s1); // Hello


        // -------------

        String result = "";
        for(int i=0; i<10000; i++){
            result = result + "Hello";
        }

        System.out.println(result);

        // it creates a temporary string everytime loop runs, so it can produce memory issue
        // So thats why String Builder, and String Buffer came into play.


        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.append(" World ").append(" ! ");

        String s3 = sb.toString(); // creates a new String

        // String builder methods:

        // sb.append("Hello");
        // sb.insert(1, "Java");
        // sb.replace(1, 3, "World");
        // sb.delete(1, 4);
        // sb.reverse();
        // sb.charAt(0);
        // sb.length();
        // sb.substring(1, 4);

        // Internal Working: It has a character array with default capacity 16, upon appending it goes only in remaining size, when it gets full a new array gets created of double size and old one gets deleted.


        // ------------------------

        // String Builder is not thread safe. So we have String Buffer


    }
}
