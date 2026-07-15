/*
 * ==============================================================
 *              JAVA TYPE CONVERSION & TYPE CASTING
 * ==============================================================
 *
 * Type Conversion (Implicit/Widening)
 * -----------------------------------
 * - Performed automatically by the Java compiler.
 * - Converts a smaller data type into a larger data type.
 * - No data loss occurs.
 *
 * Order:
 * byte -> short -> int -> long -> float -> double
 *
 *
 * Type Casting (Explicit/Narrowing)
 * ---------------------------------
 * - Performed manually by the programmer.
 * - Converts a larger data type into a smaller data type.
 * - Data loss may occur.
 *
 * Syntax:
 * targetType variable = (targetType) value;
 *
 */

public class TypeCasting {
    
    public static void main(String[] args) {

        // ==========================================================
        // 1. IMPLICIT TYPE CONVERSION (WIDENING)
        // ==========================================================

        System.out.println("========= IMPLICIT TYPE CONVERSION =========");

        int number = 100;

        // int -> double
        double decimalNumber = number;

        System.out.println("Integer Value : " + number);
        System.out.println("Converted to Double : " + decimalNumber);

        // ----------------------------------------------------------

        char letter = 'A';

        // char -> int (ASCII/Unicode Value)
        int asciiValue = letter;

        System.out.println("\nCharacter : " + letter);
        System.out.println("ASCII Value : " + asciiValue);

        // ----------------------------------------------------------

        byte smallNumber = 20;

        // byte -> int
        int bigNumber = smallNumber;

        System.out.println("\nByte Value : " + smallNumber);
        System.out.println("Converted to Int : " + bigNumber);

        //-------------------------------------------------------------

        int intnumber = 257;

        // Explicit Type Casting
        byte value = (byte) intnumber; //intnumber % 256

        System.out.println("Integer Value : " + intnumber);
        System.out.println("Byte Value    : " + value);

        // ==========================================================
        // 2. EXPLICIT TYPE CASTING (NARROWING)
        // ==========================================================

        System.out.println("\n========= EXPLICIT TYPE CASTING =========");

        double salary = 45897.75;

        // double -> int
        int roundedSalary = (int) salary;

        System.out.println("Original Double : " + salary);
        System.out.println("After Casting to Int : " + roundedSalary);

        // ----------------------------------------------------------

        long population = 9000000000L;

        // long -> int
        int newPopulation = (int) population;

        System.out.println("\nOriginal Long : " + population);
        System.out.println("After Casting to Int : " + newPopulation);
        System.out.println("Notice the incorrect value due to overflow!");

        // ----------------------------------------------------------

        int marks = 65;

        // int -> char
        char grade = (char) marks;

        System.out.println("\nInteger : " + marks);
        System.out.println("Character : " + grade);

        // ==========================================================
        // 3. OPERATIONS AFTER TYPE CONVERSION
        // ==========================================================

        System.out.println("\n========= OPERATIONS =========");

        int a = 15;
        double b = 4.5;

        // Java automatically converts int to double
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double division = a / b;

        System.out.println("Addition       : " + sum);
        System.out.println("Subtraction    : " + difference);
        System.out.println("Multiplication : " + product);
        System.out.println("Division       : " + division);

        // ==========================================================
        // 4. INTEGER DIVISION
        // ==========================================================

        System.out.println("\n========= INTEGER DIVISION =========");

        int x = 10;
        int y = 3;

        // Integer division
        System.out.println("10 / 3 = " + (x / y));

        // Convert before division
        System.out.println("10 / 3 = " + ((double) x / y));

        // ==========================================================
        // 5. CASTING DURING CALCULATION
        // ==========================================================

        System.out.println("\n========= CASTING DURING CALCULATION =========");

        int totalMarks = 455;
        int subjects = 6;

        // Wrong (Integer Division)
        double average1 = totalMarks / subjects;

        // Correct
        double average2 = (double) totalMarks / subjects;

        System.out.println("Average without Casting : " + average1);
        System.out.println("Average with Casting    : " + average2);

        // ==========================================================
        // 6. CHARACTER OPERATIONS
        // ==========================================================

        System.out.println("\n========= CHARACTER OPERATIONS =========");

        char ch = 'A';

        // Character is treated as ASCII value
        System.out.println("Character : " + ch);
        System.out.println("ASCII Value : " + (int) ch);

        // Add 1 to ASCII value
        System.out.println("Next Character : " + (char)(ch + 1));

        // ==========================================================
        // 7. MIXED DATA TYPE OPERATIONS
        // ==========================================================

        System.out.println("\n========= MIXED DATA TYPE OPERATIONS =========");

        int intValue = 50;
        float floatValue = 12.5f;

        // int automatically becomes float
        float result = intValue + floatValue;

        System.out.println("Integer : " + intValue);
        System.out.println("Float   : " + floatValue);
        System.out.println("Result  : " + result);

        // ==========================================================
        // 8. SUMMARY
        // ==========================================================

        System.out.println("\n========= SUMMARY =========");

        System.out.println("✔ Widening Conversion is Automatic.");
        System.out.println("✔ Narrowing Conversion requires Casting.");
        System.out.println("✔ Widening does NOT lose data.");
        System.out.println("✔ Narrowing MAY lose data.");
        System.out.println("✔ Mixed-type arithmetic promotes smaller types automatically.");
        System.out.println("✔ Use casting whenever precision is required.");
    }
}

