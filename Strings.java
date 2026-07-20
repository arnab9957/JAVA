/*
 * ===================================================================
 *                   JAVA STRINGS AND STRING OPERATIONS
 * ===================================================================
 *
 * What is a String?
 * -----------------
 * A String is a sequence of characters enclosed within double quotes.
 *
 * Examples:
 * ----------
 * "Hello"
 * "Java"
 * "Arnab"
 *
 * In Java, String is a class (Non-Primitive Data Type).
 *
 * String objects are immutable, which means once a String object
 * is created, its value cannot be changed.
 *
 *
 * Ways to Create Strings
 * ----------------------
 *
 * 1. String Literal
 *      String name = "Arnab";
 *
 * 2. Using new Keyword
 *      String city = new String("Kolkata");
 *
 */

public class Strings {

    public static void main(String[] args) {

        // ==========================================================
        // 1. CREATING STRINGS
        // ==========================================================

        String firstName = "Arnab";

        String lastName = new String("Dey");

        System.out.println("========== STRING CREATION ==========");

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println("HashCode For First Name: " + firstName.hashCode());

        // ==========================================================
        // 2. CONCATENATION
        // ==========================================================

        /*
         * Joining two or more strings.
         */

        System.out.println("\n========== CONCATENATION ==========");

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name : " + fullName);

        // Using concat()

        System.out.println(firstName.concat(" Kumar"));

        // ==========================================================
        // 3. STRING LENGTH
        // ==========================================================

        System.out.println("\n========== LENGTH ==========");

        System.out.println("Length = " + fullName.length());

        // ==========================================================
        // 4. ACCESSING CHARACTERS
        // ==========================================================

        /*
         * charAt(index)
         */

        System.out.println("\n========== CHARACTERS ==========");

        System.out.println("First Character : " + fullName.charAt(0));

        System.out.println("Last Character : " +
                fullName.charAt(fullName.length() - 1));

        // ==========================================================
        // 5. CONVERT TO UPPERCASE & LOWERCASE
        // ==========================================================

        System.out.println("\n========== CASE CONVERSION ==========");

        System.out.println(fullName.toUpperCase());

        System.out.println(fullName.toLowerCase());

        // ==========================================================
        // 6. COMPARING STRINGS
        // ==========================================================

        System.out.println("\n========== COMPARISON ==========");

        String s1 = "Java";
        String s2 = "Java";
        String s3 = "JAVA";

        System.out.println(s1.equals(s2));

        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s3));

        // ==========================================================
        // 7. COMPARE USING compareTo()
        // ==========================================================

        /*
         * Returns:
         * 0  -> Equal
         * <0 -> Smaller
         * >0 -> Greater
         */

        System.out.println("\n========== compareTo() ==========");

        System.out.println("Apple".compareTo("Banana"));

        System.out.println("Java".compareTo("Java"));

        // ==========================================================
        // 8. SEARCHING
        // ==========================================================

        System.out.println("\n========== SEARCH ==========");

        String language = "Java Programming";

        System.out.println(language.contains("Java"));

        System.out.println(language.startsWith("Java"));

        System.out.println(language.endsWith("ing"));

        System.out.println(language.indexOf("Program"));

        System.out.println(language.lastIndexOf("a"));

        // ==========================================================
        // 9. REPLACING CHARACTERS
        // ==========================================================

        System.out.println("\n========== REPLACE ==========");

        String sentence = "I like Java";

        System.out.println(sentence.replace("Java", "Python"));

        // ==========================================================
        // 10. SUBSTRING
        // ==========================================================

        System.out.println("\n========== SUBSTRING ==========");

        System.out.println(language.substring(5));

        System.out.println(language.substring(5,16));

        // ==========================================================
        // 11. REMOVE SPACES
        // ==========================================================

        System.out.println("\n========== TRIM ==========");

        String text = "    Hello Java    ";

        System.out.println(text.trim());

        // ==========================================================
        // 12. SPLIT STRING
        // ==========================================================

        System.out.println("\n========== SPLIT ==========");

        String fruits = "Apple,Mango,Banana,Grapes";

        String[] fruitArray = fruits.split(",");

        for(String fruit : fruitArray){

            System.out.println(fruit);

        }

        // ==========================================================
        // 13. CONVERT TO CHARACTER ARRAY
        // ==========================================================

        System.out.println("\n========== CHARACTER ARRAY ==========");

        char[] characters = firstName.toCharArray();

        for(char ch : characters){

            System.out.println(ch);

        }

        // ==========================================================
        // 14. EMPTY STRING
        // ==========================================================

        System.out.println("\n========== EMPTY STRING ==========");

        String empty = "";

        System.out.println(empty.isEmpty());

        // ==========================================================
        // 15. STRING TO NUMBER
        // ==========================================================

        System.out.println("\n========== STRING TO INTEGER ==========");

        String number = "100";

        int value = Integer.parseInt(number);

        System.out.println(value + 50);

        // ==========================================================
        // 16. NUMBER TO STRING
        // ==========================================================

        System.out.println("\n========== INTEGER TO STRING ==========");

        int marks = 95;

        String markString = String.valueOf(marks);

        System.out.println(markString);

        // ==========================================================
        // 17. STRING ITERATION
        // ==========================================================

        System.out.println("\n========== ITERATE ==========");

        for(int i=0;i<firstName.length();i++){

            System.out.println(firstName.charAt(i));

        }

        // ==========================================================
        // 18. STUDENT DATABASE (STRING ARRAY)
        // ==========================================================

        System.out.println("\n========== STUDENT DATABASE ==========");

        String[] students = {
                "Alex",
                "Bob",
                "Charlie",
                "David"
        };

        for(String student : students){

            System.out.println(student);

        }

        // ==========================================================
        // 19. StringBuffers
        // ==========================================================

        System.out.println("StringBuffers: ");
        StringBuffer sb = new StringBuffer("Arnab");
        StringBuffer sb1 = new StringBuffer("Dey");
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Is Empty: " + sb.isEmpty());
        System.out.println("Append Bool: " + sb.append(true));
        System.out.println("Object: " + sb.append(sb1));
        

        // ==========================================================
        // SUMMARY
        // ==========================================================

        System.out.println("\n========== SUMMARY ==========");

        System.out.println("✔ String Creation");
        System.out.println("✔ Concatenation");
        System.out.println("✔ Length");
        System.out.println("✔ Character Access");
        System.out.println("✔ Uppercase & Lowercase");
        System.out.println("✔ String Comparison");
        System.out.println("✔ compareTo()");
        System.out.println("✔ Searching");
        System.out.println("✔ Replace");
        System.out.println("✔ Substring");
        System.out.println("✔ Trim");
        System.out.println("✔ Split");
        System.out.println("✔ Character Array");
        System.out.println("✔ isEmpty()");
        System.out.println("✔ String ↔ Integer Conversion");
        System.out.println("✔ String Traversal");

    }
}