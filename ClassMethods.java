/*
 * ===============================================================
 *                  JAVA CLASSES AND METHODS
 * ===============================================================
 *
 * What is a Class?
 * ----------------
 * A class is a blueprint or template for creating objects.
 * It contains:
 *   • Variables (Attributes / Data Members)
 *   • Methods (Functions / Behaviors)
 *
 * Syntax:
 *
 * class ClassName{
 *
 *      // Variables
 *
 *      // Methods
 *
 * }
 *
 *
 * What is an Object?
 * ------------------
 * An object is an instance of a class.
 *
 * Syntax:
 *
 * ClassName objectName = new ClassName();
 *
 *
 * What is a Method?
 * -----------------
 * A method is a block of code that performs a specific task.
 *
 * Syntax:
 *
 * returnType methodName(parameters){
 *      // Statements
 * }
 *
 * Components of a Method:
 * -----------------------
 * 1. Access Modifier
 * 2. Return Type
 * 3. Method Name
 * 4. Parameters (Optional)
 * 5. Method Body
 *
 */

public class ClassMethods {

    // ==========================================================
    // INSTANCE VARIABLES (DATA MEMBERS)
    // ==========================================================

    /*
     * These variables belong to every object created from this class.
     */

    String name;
    int age;
    double marks;

    // ==========================================================
    // METHOD 1 : VOID METHOD
    // ==========================================================

    /*
     * A void method performs a task but does NOT return any value.
     */

    void displayDetails() {

        System.out.println("\n----- Student Details -----");

        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);

    }

    // ==========================================================
    // METHOD 2 : METHOD WITH PARAMETERS
    // ==========================================================

    /*
     * Parameters allow values to be passed into a method.
     */

    void updateMarks(double newMarks) {

        marks = newMarks;

        System.out.println("Marks Updated Successfully.");

    }

    // ==========================================================
    // METHOD 3 : RETURN METHOD
    // ==========================================================

    /*
     * Returns the student's marks.
     */

    double getMarks() {

        return marks;

    }

    // ==========================================================
    // METHOD 4 : RETURN METHOD WITH PARAMETERS
    // ==========================================================

    /*
     * Returns the sum of two integers.
     */

    int add(int a, int b) {

        return a + b;

    }

    // ==========================================================
    // METHOD 5 : METHOD OVERLOADING
    // ==========================================================

    /*
     * Same method name
     * Different parameter list
     */

    double add(double a, double b) {

        return a + b;

    }

    // ==========================================================
    // STATIC METHOD
    // ==========================================================

    /*
     * Static methods belong to the class rather than an object.
     * They can be called using the class name.
     */

    static void collegeName() {

        System.out.println("College : AGEMC");

    }

    // ==========================================================
    // MAIN METHOD
    // ==========================================================

    /*
     * Program execution starts here.
     */

    public static void main(String[] args) {

        // ======================================================
        // Calling Static Method
        // ======================================================

        System.out.println("========== STATIC METHOD ==========");

        ClassMethods.collegeName();

        // ======================================================
        // Creating an Object
        // ======================================================

        ClassMethods student = new ClassMethods();

        // ======================================================
        // Assigning Values to Instance Variables
        // ======================================================

        student.name = "Arnab";
        student.age = 20;
        student.marks = 89.5;

        // ======================================================
        // Calling Void Method
        // ======================================================

        System.out.println("\n========== VOID METHOD ==========");

        student.displayDetails();

        // ======================================================
        // Calling Method with Parameters
        // ======================================================

        System.out.println("\n========== METHOD WITH PARAMETERS ==========");

        student.updateMarks(95);

        student.displayDetails();

        // ======================================================
        // Calling Return Method
        // ======================================================

        System.out.println("\n========== RETURN METHOD ==========");

        double marks = student.getMarks();

        System.out.println("Student Marks : " + marks);

        // ======================================================
        // Calling Method with Integer Parameters
        // ======================================================

        System.out.println("\n========== INTEGER METHOD ==========");

        int sum1 = student.add(10, 20);

        System.out.println("10 + 20 = " + sum1);

        // ======================================================
        // Calling Overloaded Method
        // ======================================================

        System.out.println("\n========== METHOD OVERLOADING ==========");

        double sum2 = student.add(10.5, 20.5);

        System.out.println("10.5 + 20.5 = " + sum2);

        // ======================================================
        // SUMMARY
        // ======================================================

        System.out.println("\n========== SUMMARY ==========");

        System.out.println("✔ Class        : Blueprint for objects");
        System.out.println("✔ Object       : Instance of a class");
        System.out.println("✔ Variables    : Store object data");
        System.out.println("✔ Methods      : Define object behavior");
        System.out.println("✔ Void Method  : Returns nothing");
        System.out.println("✔ Return Method: Returns a value");
        System.out.println("✔ Parameters   : Accept input values");
        System.out.println("✔ Static Method: Belongs to the class");
        System.out.println("✔ Overloading  : Same method, different parameters");

    }
}