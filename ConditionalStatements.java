/*
 * ===============================================================
 *              JAVA CONDITIONAL STATEMENTS
 * ===============================================================
 *
 * Conditional statements allow a program to make decisions based
 * on whether a condition is true or false.
 *
 * Types of Conditional Statements:
 *
 * 1. if
 * 2. if-else
 * 3. if-else-if Ladder
 * 4. Nested if
 * 5. switch
 * 6. Ternary Operator (?:)
 *
 * Comparison Operators:
 * ---------------------
 * ==  Equal To
 * !=  Not Equal To
 * >   Greater Than
 * <   Less Than
 * >=  Greater Than or Equal To
 * <=  Less Than or Equal To
 *
 * Logical Operators:
 * ------------------
 * &&  Logical AND
 * ||  Logical OR
 * !   Logical NOT
 *
 */

public class ConditionalStatements {

    public static void main(String[] args) {

        // Sample Variables

        int age = 20;
        int marks = 85;
        int number = 10;
        char grade = 'B';

        // ==========================================================
        // 1. SIMPLE IF STATEMENT
        // ==========================================================

        System.out.println("========== IF Statement ==========");

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        // ==========================================================
        // 2. IF-ELSE STATEMENT
        // ==========================================================

        System.out.println("\n========== IF-ELSE Statement ==========");

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        // ==========================================================
        // 3. IF-ELSE-IF LADDER
        // ==========================================================

        System.out.println("\n========== IF-ELSE-IF Ladder ==========");

        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // ==========================================================
        // 4. NESTED IF
        // ==========================================================

        System.out.println("\n========== Nested IF ==========");

        int salary = 50000;
        int experience = 3;

        if (salary >= 40000) {

            if (experience >= 2) {
                System.out.println("Eligible for Promotion");
            } else {
                System.out.println("Need More Experience");
            }

        } else {
            System.out.println("Salary Criteria Not Met");
        }

        // ==========================================================
        // 5. LOGICAL OPERATORS WITH IF
        // ==========================================================

        System.out.println("\n========== Logical Operators ==========");

        if (age >= 18 && marks >= 60) {
            System.out.println("Eligible for Admission");
        }

        if (age >= 18 || marks >= 90) {
            System.out.println("Condition satisfied using OR");
        }

        if (!(marks < 40)) {
            System.out.println("Student Passed");
        }

        // ==========================================================
        // 6. SWITCH STATEMENT
        // ==========================================================

        System.out.println("\n========== SWITCH Statement ==========");

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Very Good");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Average");
                break;

            default:
                System.out.println("Invalid Grade");
        }

        // ==========================================================
        // 7. SIMPLE TERNARY OPERATOR
        // ==========================================================

        /*
         * Syntax:
         *
         * variable = (condition) ? value_if_true : value_if_false;
         */

        System.out.println("\n========== Ternary Operator ==========");

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);

        // ==========================================================
        // 8. TERNARY FOR MAXIMUM OF TWO NUMBERS
        // ==========================================================

        System.out.println("\n========== Maximum of Two Numbers ==========");

        int a = 25;
        int b = 40;

        int max = (a > b) ? a : b;

        System.out.println("Maximum = " + max);

        // ==========================================================
        // 9. NESTED TERNARY OPERATOR
        // ==========================================================

        /*
         * Syntax:
         *
         * condition1
         * ? value1
         * : condition2
         *      ? value2
         *      : value3;
         */

        System.out.println("\n========== Nested Ternary ==========");

        int score = 72;

        String performance =
                (score >= 90) ? "Excellent"
                : (score >= 75) ? "Very Good"
                : (score >= 60) ? "Good"
                : "Needs Improvement";

        System.out.println("Performance : " + performance);

        // ==========================================================
        // 10. TERNARY VS IF-ELSE
        // ==========================================================

        System.out.println("\n========== Ternary vs If-Else ==========");

        // Using If-Else

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // Using Ternary

        String status = (age >= 18) ? "Adult" : "Minor";

        System.out.println(status);

        // ==========================================================
        // SUMMARY
        // ==========================================================

        System.out.println("\n========== SUMMARY ==========");

        System.out.println("✔ if          -> Executes when condition is true.");
        System.out.println("✔ if-else     -> Chooses between two blocks.");
        System.out.println("✔ if-else-if  -> Handles multiple conditions.");
        System.out.println("✔ Nested if   -> Places one if inside another.");
        System.out.println("✔ switch      -> Selects one case from many.");
        System.out.println("✔ Ternary     -> Short form of if-else.");
    }
}