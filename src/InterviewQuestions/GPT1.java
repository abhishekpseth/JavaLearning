package InterviewQuestions;

public class GPT1 {
    public static void main(String[] args) {
        // ------------- 1. What is the difference between JDK, JRE, and JVM? ---------------

        // JVM converts compiled byte code to machine code. JRE = JVM + libraries required to run a java programme. JDK = JRE + dev. tools required (Debugger, compiler etc.)
        // JVM < JRE < JDK

        // ------------- 2. What are the main features of Java? -------------

        // 1. Platform independent.
        // 2. Object-Oriented.
        // 3. Multithreaded
        // 4. Strong memory management via Garbage Collection.
        // 5. Though interpreted, Java uses Just-In-Time (JIT) compilation, which converts bytecode into native machine code at runtime.
        // 6. Simple and Easy to Learn (Its syntax is similar to C/C++ but removes complex parts like pointers and operator overloading)
        // 7. Secure (Java runs in a sandboxed environment and doesn’t allow direct memory access, which prevents security issues.)

        // ------------- 3. Why is Java platform-independent? -------------
        // Java is platform-independent because it is not directly compiled to machine code, instead it does into an intermediate form called bytecode.
        // this bytecode can be used to run java application in any machine which has JVM which eventually converts it into machine code.

        // ------------- 4. What is the difference between == and .equals() in Java? -------------

        // In Java, == compares references (memory addresses), while .equals() compares the actual contents (values) of the objects.

        // 5. What is the default value of an uninitialized variable in Java?

        //  | Data Type             | Default Value               |
        //  | --------------------- | --------------------------- |
        //  | `byte`                | `0`                         |
        //  | `short`               | `0`                         |
        //  | `int`                 | `0`                         |
        //  | `long`                | `0L`                        |
        //  | `float`               | `0.0f`                      |
        //  | `double`              | `0.0d`                      |
        //  | `char`                | `'\u0000'` (null character) |
        //  | `boolean`             | `false`                     |
        //  | **Object references** | `null`                      |


        //  In Java, instance and static variables are automatically initialized with default values based on their data type — for example, 0 for numeric types, false for boolean, and null for objects.
        //  However, local variables inside methods are not initialized by default — they must be explicitly assigned before use, otherwise the compiler throws an error.

        // 6. What are the four pillars of Object-Oriented Programming (OOP) in Java?

        // a) Encapsulation (Data Hiding & access modifiers)
        // b) Inheritance (Code Reusability)
        // c) Polymorphism (Many Forms)
        // d) Abstraction (Hiding Implementation Details)

        // 7. What is the difference between method overloading and method overriding?

        // Method Overloading happens when multiple methods in the same class have the same name but different parameters (compile-time polymorphism).
        // Method Overriding happens when a subclass provides its own implementation of a method already defined in its parent class (runtime polymorphism).

        // 8. What is the difference between an abstract class and an interface?

        //

        // 9. What is encapsulation in Java?

        // 10. What is the difference between final, finally, and finalize?

        // 11. What is the difference between checked and unchecked exceptions?

        // 12. What is the difference between String, StringBuilder, and StringBuffer?

        // 13. What is the difference between an Array and an ArrayList?

        // 14. What is the difference between HashMap and HashSet?

        // 15. What is the difference between Comparable and Comparator?

        // 16. What is the difference between Stack and Queue?

        // 17. throw vs throws in Exception Handling

        // 18. ArrayList vs LinkedList

        // 19. Generics in Java

        // 20. HashMap vs HashSet

        // 21. How HashSet uses HashMap internally
    }
}
