/*
 * ===============================================================
 *             AUTOMATIC TYPE PROMOTION IN JAVA
 * ===============================================================
 *
 * Definition:
 * -----------
 * Automatic Type Promotion is the process where Java automatically
 * converts smaller data types into larger data types during
 * arithmetic operations to avoid data loss.
 *
 * Promotion Order:
 *
 * byte -> short -> int -> long -> float -> double
 *
 * Important Rules:
 * ----------------
 * 1. byte, short, and char are automatically promoted to int
 *    before any arithmetic operation.
 *
 * 2. If operands have different data types, Java promotes the
 *    smaller type to the larger type.
 *
 * 3. The result of an arithmetic operation is always of the
 *    largest data type involved in the expression.
 *
 */

public class TypePromotion {

    public static void main(String[] args) {

        // ==========================================================
        // EXAMPLE 1 : byte + byte
        // ==========================================================

        System.out.println("========== Example 1 ==========");

        byte a = 10;
        byte b = 20;

        // ERROR:
        // byte result = a + b;

        // Why?
        // Both byte variables are promoted to int before addition.
        // Therefore, the result is int.

        int result1 = a + b;

        System.out.println("Byte A = " + a);
        System.out.println("Byte B = " + b);
        System.out.println("Integer Result = " + result1);

        // ==========================================================
        // EXAMPLE 2 : short + short
        // ==========================================================

        System.out.println("\n========== Example 2 ==========");

        short x = 100;
        short y = 50;

        // short + short = int

        int result2 = x + y;

        System.out.println("Short X = " + x);
        System.out.println("Short Y = " + y);
        System.out.println("Integer Result = " + result2);

        // ==========================================================
        // EXAMPLE 3 : char + char
        // ==========================================================

        System.out.println("\n========== Example 3 ==========");

        char ch1 = 'A';
        char ch2 = 'B';

        // Characters are promoted to int (ASCII/Unicode values)

        int result3 = ch1 + ch2;

        System.out.println("Character 1 = " + ch1);
        System.out.println("Character 2 = " + ch2);
        System.out.println("ASCII Sum = " + result3);

        // ==========================================================
        // EXAMPLE 4 : int + double
        // ==========================================================

        System.out.println("\n========== Example 4 ==========");

        int number = 25;
        double decimal = 5.5;

        // int is promoted to double

        double result4 = number + decimal;

        System.out.println("Integer = " + number);
        System.out.println("Double = " + decimal);
        System.out.println("Double Result = " + result4);

        // ==========================================================
        // EXAMPLE 5 : long + float
        // ==========================================================

        System.out.println("\n========== Example 5 ==========");

        long population = 100000L;
        float growth = 12.75f;

        // long is promoted to float

        float result5 = population + growth;

        System.out.println("Long = " + population);
        System.out.println("Float = " + growth);
        System.out.println("Float Result = " + result5);

        // ==========================================================
        // EXAMPLE 6 : float + double
        // ==========================================================

        System.out.println("\n========== Example 6 ==========");

        float price = 25.50f;
        double tax = 2.75;

        // float is promoted to double

        double result6 = price + tax;

        System.out.println("Float = " + price);
        System.out.println("Double = " + tax);
        System.out.println("Double Result = " + result6);

        // ==========================================================
        // EXAMPLE 7 : Mixed Expression
        // ==========================================================

        System.out.println("\n========== Example 7 ==========");

        byte p = 5;
        short q = 10;
        int r = 20;
        double s = 2.5;

        // byte -> int
        // short -> int
        // int -> double
        // Final result = double

        double result7 = p + q + r + s;

        System.out.println("Double Result = " + result7);

        // ==========================================================
        // EXAMPLE 8 : Integer Division
        // ==========================================================

        System.out.println("\n========== Example 8 ==========");

        int m = 10;
        int n = 3;

        // Both operands are int
        // Result is int

        int division1 = m / n;

        System.out.println("Integer 10 / 3 = " + division1);

        // One operand is double
        // Entire expression becomes double

        double division2 = (double) m / n;

        System.out.println("10 / 3 = " + division2);

        // ==========================================================
        // EXAMPLE 9 : Character Arithmetic
        // ==========================================================

        System.out.println("\n========== Example 9 ==========");

        char letter = 'A';

        // 'A' -> 65
        // 65 + 1 = 66

        int nextAscii = letter + 1;

        System.out.println("Current Character = " + letter);
        System.out.println("Next ASCII Value = " + nextAscii);
        System.out.println("Next Character = " + (char) nextAscii);

        // ==========================================================
        // SUMMARY
        // ==========================================================

        System.out.println("\n========== SUMMARY ==========");

        System.out.println("1. byte, short and char are promoted to int.");
        System.out.println("2. Smaller types are promoted to larger types.");
        System.out.println("3. Result type is the largest data type involved.");
        System.out.println("4. Automatic promotion prevents loss of precision.");
    }
}