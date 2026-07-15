        //                   JAVA EXECUTION FLOW (COMMAND LINE)

        //                              👨‍💻 Developer
        //                                   │
        //                                   ▼
        //                        Write Java Source Code
        //                             Hello.java
        //                                   │
        //                                   ▼
        //                  Compile using Java Compiler (javac)
        //                    Command: javac Hello.java
        //                                   │
        //                                   ▼
        //                    Bytecode Generated (.class file)
        //                             Hello.class
        //                                   │
        //                                   ▼
        //                     Run using Java Interpreter (java)
        //                      Command: java Hello
        //                                   │
        //                                   ▼
        //                 Java Virtual Machine (JVM) Starts
        //                                   │
        //          ┌────────────────────────┼────────────────────────┐
        //          │                        │                        │
        //          ▼                        ▼                        ▼
        //    Class Loader           Bytecode Verifier       Runtime Libraries
        //   (Loads .class)       (Checks for Security)        (Java API)
        //          │                        │                        │
        //          └────────────────────────┼────────────────────────┘
        //                                   │
        //                                   ▼
        //                         Execution Engine
        //               (Interpreter + JIT Compiler)
        //                                   │
        //                                   ▼
        //                      Native Machine Code
        //                                   │
        //                                   ▼
        //                       Operating System (OS)
        //                                   │
        //                                   ▼
        //                    Hardware (CPU, Memory, Disk)
        //                                   │
        //                                   ▼
        //                        Program Output Displayed

// Program: Java Basics - Data Types and Basic Operations

public class Basics {

    public static void main(String[] args) {

        // ===============================
        // PRIMITIVE DATA TYPES
        // ===============================

        // Integer (Whole Number)
        int age = 20;

        // Long Integer
        long population = 8000000000L;

        // Short Integer
        short year = 2026;

        // Byte
        byte marks = 95;

        // Decimal Number (Single Precision)
        float pi = 3.14f;

        // Decimal Number (Double Precision)
        double salary = 45678.99;

        // Single Character
        char grade = 'A';

        // Boolean (true/false)
        boolean isPassed = true;

        // ===============================
        // NON-PRIMITIVE DATA TYPE
        // ===============================

        String name = "Arnab";

        // ===============================
        // PRINT VARIABLES
        // ===============================

        System.out.println("===== DATA TYPES =====");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Population : " + population);
        System.out.println("Year : " + year);
        System.out.println("Marks : " + marks);
        System.out.println("Pi : " + pi);
        System.out.println("Salary : " + salary);
        System.out.println("Grade : " + grade);
        System.out.println("Passed : " + isPassed);

        // ===============================
        // ARITHMETIC OPERATORS
        // ===============================

        int a = 20;
        int b = 10;

        System.out.println("\n===== ARITHMETIC OPERATORS =====");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        // ===============================
        // ASSIGNMENT OPERATORS
        // ===============================

        int x = 10;

        x += 5;
        System.out.println("\nAfter += : " + x);

        x -= 3;
        System.out.println("After -= : " + x);

        x *= 2;
        System.out.println("After *= : " + x);

        x /= 4;
        System.out.println("After /= : " + x);

        x %= 3;
        System.out.println("After %= : " + x);

        // ===============================
        // COMPARISON OPERATORS
        // ===============================

        System.out.println("\n===== COMPARISON OPERATORS =====");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // ===============================
        // LOGICAL OPERATORS
        // ===============================

        boolean p = true;
        boolean q = false;

        System.out.println("\n===== LOGICAL OPERATORS =====");
        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p : " + (!p));

        // ===============================
        // UNARY OPERATORS
        // ===============================

        int num = 5;

        System.out.println("\n===== UNARY OPERATORS =====");
        System.out.println("Positive : " + (+num));
        System.out.println("Negative : " + (-num));

        // Increment
        System.out.println("Pre Increment : " + (++num));

        // Decrement
        System.out.println("Post Decrement : " + (num--));

        System.out.println("Current Value : " + num);

        // ===============================
        // TYPE CASTING
        // ===============================

        double d = 25.75;
        int i = (int) d;      // Explicit Type Casting

        int number = 100;
        double decimal = number;   // Implicit Type Casting

        System.out.println("\n===== TYPE CASTING =====");
        System.out.println("Double to Int : " + i);
        System.out.println("Int to Double : " + decimal);

        // ===============================
        // STRING OPERATIONS
        // ===============================

        String firstName = "Arnab";
        String lastName = "Dey";

        System.out.println("\n===== STRING OPERATIONS =====");
        System.out.println("Full Name : " + firstName + " " + lastName);
        System.out.println("Length : " + firstName.length());
        System.out.println("Uppercase : " + firstName.toUpperCase());
        System.out.println("Lowercase : " + firstName.toLowerCase());

        // ===============================
        // FINAL OUTPUT
        // ===============================

        System.out.println("\nBasics of JAVA!");
    }
}