/*
 * ===================================================================
 *          ENCAPSULATION WITH STATIC IN JAVA (COMPLETE PROGRAM)
 * ===================================================================
 *
 * What is Encapsulation?
 * ----------------------
 * Encapsulation is the process of wrapping data (variables) and
 * methods into a single unit (class) while restricting direct access
 * to the data.
 *
 * It is achieved by:
 * 1. Declaring variables as private.
 * 2. Providing public Getter methods.
 * 3. Providing public Setter methods.
 *
 * Advantages:
 * -----------
 * ✔ Data Hiding
 * ✔ Security
 * ✔ Controlled Access
 * ✔ Easy Maintenance
 * ✔ Better Reusability
 *
 * ===================================================================
 */

public class Encapsulation {

    // ==========================================================
    // PRIVATE INSTANCE VARIABLES
    // (Each object has its own separate copy)
    // ==========================================================

    private int rollNo;
    private String name;
    private double marks;

    // ==========================================================
    // STATIC VARIABLES
    // (Shared among all objects)
    // ==========================================================

    private static String collegeName;
    private static int EncapsulationCount;

    // ==========================================================
    // STATIC INITIALIZATION BLOCK
    // ==========================================================

    /*
     * A static block executes ONLY ONCE when the class
     * is loaded into memory.
     *
     * It is mainly used to initialize static variables.
     */

    static {

        collegeName = "AGEMC";
        EncapsulationCount = 0;

        System.out.println("================================");
        System.out.println("Static Block Executed");
        System.out.println("College Initialized : " + collegeName);
        System.out.println("================================");

    }

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    /*
     * Constructor executes whenever an object is created.
     * Here we increment the Encapsulation counter.
     */

    public Encapsulation() {

        EncapsulationCount++;

    }

    // ==========================================================
    // SETTER METHODS
    // ==========================================================

    public void setRollNo(int rollNo) {

        this.rollNo = rollNo;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setMarks(double marks) {

        if (marks >= 0 && marks <= 100) {

            this.marks = marks;

        } else {

            System.out.println("Invalid Marks!");

        }

    }

    // ==========================================================
    // GETTER METHODS
    // ==========================================================

    public int getRollNo() {

        return rollNo;

    }

    public String getName() {

        return name;

    }

    public double getMarks() {

        return marks;

    }

    // ==========================================================
    // STATIC METHODS
    // ==========================================================

    /*
     * Displays the common college name.
     */

    public static void displayCollege() {

        System.out.println("College Name : " + collegeName);

    }

    /*
     * Changes the college name.
     * Since the variable is static,
     * every object sees the updated value.
     */

    public static void changeCollege(String newCollege) {

        collegeName = newCollege;

    }

    /*
     * Displays total Encapsulations created.
     */

    public static void displayEncapsulationCount() {

        System.out.println("Total Encapsulations : " + EncapsulationCount);

    }

    // ==========================================================
    // INSTANCE METHOD
    // ==========================================================

    /*
     * Displays complete Encapsulation information.
     */

    public void displayEncapsulation() {

        System.out.println("\nEncapsulation Details");
        System.out.println("-------------------------");

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println("College : " + collegeName);

    }

    // ==========================================================
    // MAIN METHOD
    // ==========================================================

    public static void main(String[] args) {

        // Calling Static Method
        Encapsulation.displayCollege();

        // Creating Objects
        Encapsulation s1 = new Encapsulation();
        Encapsulation s2 = new Encapsulation();
        Encapsulation s3 = new Encapsulation();

        // Setting Values

        s1.setRollNo(101);
        s1.setName("Arnab");
        s1.setMarks(95);

        s2.setRollNo(102);
        s2.setName("Rahul");
        s2.setMarks(88);

        s3.setRollNo(103);
        s3.setName("Alex");
        s3.setMarks(91);

        // Using Getter Methods

        System.out.println("\nAccessing Encapsulation Data using Getters");

        System.out.println("Name  : " + s1.getName());
        System.out.println("Marks : " + s1.getMarks());

        // Display Encapsulation Details

        s1.displayEncapsulation();
        s2.displayEncapsulation();
        s3.displayEncapsulation();

        // Display Encapsulation Counter

        System.out.println();

        Encapsulation.displayEncapsulationCount();

        // Change College Name

        Encapsulation.changeCollege("IEM Kolkata");

        System.out.println("\nAfter Changing College Name");

        s1.displayEncapsulation();
        s2.displayEncapsulation();
        s3.displayEncapsulation();

    }

}