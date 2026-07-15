/*
 * ===================================================================
 *                    JAVA ARRAYS AND ARRAY OPERATIONS
 * ===================================================================
 *
 * What is an Array?
 * -----------------
 * An array is a collection of elements of the same data type stored
 * in contiguous memory locations.
 *
 * Each element is accessed using an index.
 *
 * Indexing starts from 0.
 *
 * Example:
 *
 * Index :   0    1    2    3    4
 * Value :  10   20   30   40   50
 *
 *
 * Advantages:
 * -----------
 * ✔ Stores multiple values using a single variable.
 * ✔ Easy to traverse using loops.
 * ✔ Faster access using indexes.
 *
 * Disadvantages:
 * --------------
 * ✘ Fixed size.
 * ✘ Can store only one data type.
 *
 */

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // ==========================================================
        // 1. DECLARING AN ARRAY
        // ==========================================================

        /*
         * Syntax:
         *
         * dataType[] arrayName;
         */

        int[] numbers;

        // ==========================================================
        // 2. CREATING AN ARRAY
        // ==========================================================

        /*
         * Syntax:
         *
         * arrayName = new dataType[size];
         */

        numbers = new int[5];

        // ==========================================================
        // 3. INITIALIZING ARRAY ELEMENTS
        // ==========================================================

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // ==========================================================
        // 4. DECLARING AND INITIALIZING TOGETHER
        // ==========================================================

        int marks [] = {85, 90, 75, 95, 88};

        // ==========================================================
        // 5. ACCESSING ELEMENTS
        // ==========================================================

        System.out.println("========== ACCESSING ELEMENTS ==========");

        System.out.println("First Element : " + numbers[0]);
        System.out.println("Last Element  : " + numbers[4]);

        // ==========================================================
        // 6. ARRAY LENGTH
        // ==========================================================

        System.out.println("\n========== ARRAY LENGTH ==========");

        System.out.println("Length = " + numbers.length);

        // ==========================================================
        // 7. TRAVERSING USING FOR LOOP
        // ==========================================================

        System.out.println("\n========== FOR LOOP ==========");

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("numbers[" + i + "] = " + numbers[i]);

        }

        // ==========================================================
        // 8. TRAVERSING USING FOR-EACH LOOP
        // ==========================================================

        System.out.println("\n========== FOR-EACH LOOP ==========");

        for (int value : numbers) {

            System.out.println(value);

        }

        // ==========================================================
        // 9. SUM OF ARRAY ELEMENTS
        // ==========================================================

        System.out.println("\n========== SUM ==========");

        int sum = 0;

        for (int value : numbers) {

            sum += value;

        }

        System.out.println("Sum = " + sum);

        // ==========================================================
        // 10. AVERAGE OF ARRAY
        // ==========================================================

        System.out.println("\n========== AVERAGE ==========");

        double average = (double) sum / numbers.length;

        System.out.println("Average = " + average);

        // ==========================================================
        // 11. FIND MAXIMUM ELEMENT
        // ==========================================================

        System.out.println("\n========== MAXIMUM ==========");

        int max = numbers[0];

        for (int value : numbers) {

            if (value > max) {

                max = value;

            }

        }

        System.out.println("Maximum = " + max);

        // ==========================================================
        // 12. FIND MINIMUM ELEMENT
        // ==========================================================

        System.out.println("\n========== MINIMUM ==========");

        int min = numbers[0];

        for (int value : numbers) {

            if (value < min) {

                min = value;

            }

        }

        System.out.println("Minimum = " + min);

        // ==========================================================
        // 13. SEARCHING AN ELEMENT (LINEAR SEARCH)
        // ==========================================================

        System.out.println("\n========== LINEAR SEARCH ==========");

        int search = 30;
        boolean found = false;

        for (int value : numbers) {

            if (value == search) {

                found = true;
                break;

            }

        }

        if (found)

            System.out.println(search + " Found");

        else

            System.out.println(search + " Not Found");

        // ==========================================================
        // 14. MODIFYING AN ELEMENT
        // ==========================================================

        System.out.println("\n========== UPDATE ELEMENT ==========");

        numbers[2] = 100;

        System.out.println("Updated Third Element = " + numbers[2]);

        // ==========================================================
        // 15. SORTING AN ARRAY
        // ==========================================================

        System.out.println("\n========== SORTING ==========");

        int[] values = {50, 10, 80, 40, 20};

        Arrays.sort(values);

        System.out.println(Arrays.toString(values));

        // ==========================================================
        // 16. COPYING AN ARRAY
        // ==========================================================

        System.out.println("\n========== COPYING ==========");

        int[] copy = Arrays.copyOf(numbers, numbers.length);

        System.out.println(Arrays.toString(copy));

        // ==========================================================
        // 17. FILLING AN ARRAY
        // ==========================================================

        System.out.println("\n========== FILL ==========");

        int[] data = new int[5];

        Arrays.fill(data, 7);

        System.out.println(Arrays.toString(data));

        // ==========================================================
        // 18. COMPARING ARRAYS
        // ==========================================================

        System.out.println("\n========== COMPARE ==========");

        int[] a = {1,2,3};
        int[] b = {1,2,3};

        System.out.println(Arrays.equals(a, b));

        // ==========================================================
        // 19. PRINTING ARRAY
        // ==========================================================

        System.out.println("\n========== PRINT ==========");

        System.out.println(Arrays.toString(numbers));
    }
}