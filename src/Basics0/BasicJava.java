package Basics0;

public class BasicJava {
    // -------- 1. What is JVM, JRE, JDK --------
        // Hello.java --- (compiler) --> Hello.class --- (JVM) ---> machine code
        // JVM (Java Virtual Machine) : translate compiled bytecode to machine code.
        // JRE (Java Runtime Error) : JVM + java class libraries and other components required to run java applications
        // JDK (Java Development Kit) : Software development kit required to develop java applications in java. JDK = JRE + development tools (compilers, javaDoc, java debugger etc.)
        // summary -> JVM < JRE < JDK

    // 2.--------  What is build system. Maven vs Gradle --------
        // A build system automates the process of turning your source code (.java files) into a runnable program (like .class or .jar files). (Note: diff b/w .class and .jar: .class file is a compiled Java file. A .jar file is a package — it can contain multiple .class files, along with metadata (like a manifest) and other resources (images, property files, etc.) all bundled into one compressed file (like a .zip).)
        // It usually does things like:
        //    Compile code (javac)
        //    Run tests (JUnit, etc.)
        //    Package code into .jar or .war
        //    Manage dependencies (external libraries)
        //    Run tasks automatically (clean, build, deploy)
        //    Without a build system, you’d need to manually run javac, copy files, manage libraries, etc. — which gets messy fast.

    // 👉 Maven:
        // Apache Maven is a build automation and dependency management tool.
        // Uses an XML file (pom.xml) to describe:
        //     a) Dependencies (external libraries)
        //     b) Build configuration
        //     c) Plugins (for testing, packaging, etc.)
        // Pros:
        //      Standard in the Java world (lots of companies use it).
        //      Huge ecosystem of plugins/libraries
        // Cons:
        //      XML can get verbose
        //      Less flexible than Gradle

        // 👉 Gradle:
        // Gradle is a more modern build system.
        // Uses Groovy or Kotlin DSL instead of XML.
        // Pros:
        //      Faster builds (incremental & parallel).
        //      More flexible than Maven (you can script tasks)
        // Cons:
        //      Slightly harder to learn at first
        //      Not as universally adopted as Maven (but catching up fast)

    // ---------- Manually writing java file -> compiling -> running -------------------------------------------------------
    //
    // -> 1. create a file HelloWorld.java (can be done from terminal)
    // -> 2. Go to it and write your code in it. (can be done from terminal)
    // -> 3. now save it.
    // -> 4. Compile it from terminal using, javac HelloWorld.txt
    // -> 5. Run it from terminal using, java HelloWorld
    //

}
