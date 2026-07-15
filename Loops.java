/*
 * ===================================================================
 *                    JAVA LOOPS - COMPLETE DEMONSTRATION
 * ===================================================================
 *
 * Definition:
 * ----------
 * A loop is used to execute a block of code repeatedly until a
 * specified condition becomes false.
 *
 * Advantages:
 * -----------
 * ✔ Reduces code repetition
 * ✔ Makes programs shorter
 * ✔ Improves readability
 * ✔ Useful for repetitive tasks
 *
 * Types of Loops:
 * ---------------
 * 1. for Loop
 * 2. while Loop
 * 3. do-while Loop
 * 4. Enhanced for Loop (for-each)
 *
 * Loop Control Statements:
 * ------------------------
 * • break
 * • continue
 *
 */

public class Loops {

    public static void main(String[] args) {

        // ==========================================================
        // 1. FOR LOOP
        // ==========================================================

        /*
         * Syntax:
         *
         * for(initialization; condition; update){
         *      // Statements
         * }
         *
         * Initialization -> Executes only once
         * Condition      -> Checked before every iteration
         * Update         -> Executes after every iteration
         */

        System.out.println("========== FOR LOOP ==========");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration : " + i);
        }

        // ==========================================================
        // 2. WHILE LOOP
        // ==========================================================

        /*
         * Syntax:
         *
         * while(condition){
         *      // Statements
         *      update;
         * }
         *
         * Used when the number of iterations is NOT known.
         */

        System.out.println("\n========== WHILE LOOP ==========");

        int count = 1;

        while (count <= 5) {

            System.out.println("Count = " + count);

            count++;
        }

        // ==========================================================
        // 3. DO-WHILE LOOP
        // ==========================================================

        /*
         * Syntax:
         *
         * do{
         *      // Statements
         * }while(condition);
         *
         * Executes at least ONE time.
         */

        System.out.println("\n========== DO-WHILE LOOP ==========");

        int number = 1;

        do {

            System.out.println("Number = " + number);

            number++;

        } while (number <= 5);

        // ==========================================================
        // 4. ENHANCED FOR LOOP (FOR-EACH)
        // ==========================================================

        /*
         * Used for Arrays and Collections.
         *
         * Syntax:
         *
         * for(dataType variable : collection){
         *      // Statements
         * }
         */

        System.out.println("\n========== ENHANCED FOR LOOP ==========");

        int[] marks = {85, 90, 75, 95, 88};

        for (int mark : marks) {

            System.out.println("Marks = " + mark);

        }

        // ==========================================================
        // 5. NESTED FOR LOOP
        // ==========================================================

        /*
         * A loop inside another loop.
         */

        System.out.println("\n========== NESTED FOR LOOP ==========");

        for (int row = 1; row <= 3; row++) {

            for (int column = 1; column <= 3; column++) {

                System.out.print("* ");

            }

            System.out.println();

        }

        // ==========================================================
        // 6. BREAK STATEMENT
        // ==========================================================

        /*
         * break immediately terminates the loop.
         */

        System.out.println("\n========== BREAK ==========");

        for (int i = 1; i <= 10; i++) {

            if (i == 6) {

                break;

            }

            System.out.println(i);

        }

        // ==========================================================
        // 7. CONTINUE STATEMENT
        // ==========================================================

        /*
         * continue skips the current iteration.
         */

        System.out.println("\n========== CONTINUE ==========");

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {

                continue;

            }

            System.out.println(i);

        }

        // ==========================================================
        // 8. SUM OF FIRST 10 NATURAL NUMBERS
        // ==========================================================

        System.out.println("\n========== SUM ==========");

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            sum += i;

        }

        System.out.println("Sum = " + sum);

        // ==========================================================
        // 9. MULTIPLICATION TABLE
        // ==========================================================

        System.out.println("\n========== MULTIPLICATION TABLE ==========");

        int table = 5;

        for (int i = 1; i <= 10; i++) {

            System.out.println(table + " x " + i + " = " + (table * i));

        }

        // ==========================================================
        // 10. EVEN NUMBERS
        // ==========================================================

        System.out.println("\n========== EVEN NUMBERS ==========");

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " ");

            }

        }

        // ==========================================================
        // 11. ODD NUMBERS
        // ==========================================================

        System.out.println("\n\n========== ODD NUMBERS ==========");

        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) {

                System.out.print(i + " ");

            }

        }

        // ==========================================================
        // 12. FACTORIAL
        // ==========================================================

        System.out.println("\n\n========== FACTORIAL ==========");

        int factorial = 1;

        for (int i = 1; i <= 5; i++) {

            factorial *= i;

        }

        System.out.println("5! = " + factorial);

        // ==========================================================
        // 13. REVERSE COUNTING
        // ==========================================================

        System.out.println("\n========== REVERSE COUNTING ==========");

        for (int i = 10; i >= 1; i--) {

            System.out.print(i + " ");

        }

        // ==========================================================
        // 14. INFINITE LOOP (Commented)
        // ==========================================================

        /*
         * Infinite Loop Examples
         *
         * while(true){
         *      System.out.println("Infinite Loop");
         * }
         *
         * for(;;){
         *      System.out.println("Infinite Loop");
         * }
         */

        // ==========================================================
        // SUMMARY
        // ==========================================================

        System.out.println("\n\n========== SUMMARY ==========");

        System.out.println("✔ for Loop      : Known number of iterations");
        System.out.println("✔ while Loop    : Unknown number of iterations");
        System.out.println("✔ do-while Loop : Executes at least once");
        System.out.println("✔ for-each Loop : Traverses arrays/collections");
        System.out.println("✔ break         : Terminates loop");
        System.out.println("✔ continue      : Skips current iteration");

    }
}