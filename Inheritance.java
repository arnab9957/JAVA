/**
 * Parent Class: Vehicle
 * Demonstrates basic fields, constructors, and instance methods.
 */
class Vehicle {
    // Protected field: accessible in child classes and same package
    protected String brand;
    private int speed;

    /**
     * Default / Parameterless Constructor
     */
    public Vehicle() {
        // 'this(...)' calls another constructor in the SAME class
        this("Generic Brand", 0);
        System.out.println("Vehicle: Default Constructor called.");
    }

    /**
     * Parameterized Constructor
     * @param brand Name of the vehicle brand
     * @param speed Current speed of the vehicle
     */
    public Vehicle(String brand, int speed) {
        // 'this.field' distinguishes instance variables from local parameters
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle: Parameterized Constructor called.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + this.brand + ", Speed: " + this.speed + " km/h");
    }

    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

/**
 * Child Class: Car
 * Inherits from Vehicle using the 'extends' keyword.
 */
class Car extends Vehicle {
    private int numberOfDoors;
    private String brand; // Field shadowing (hides parent's 'brand' field)

    /**
     * Parameterized Constructor
     * @param brand Name of the car brand
     * @param speed Initial speed
     * @param numberOfDoors Total doors in the car
     */
    public Car(String brand, int speed, int numberOfDoors) {
        // 'super(...)' MUST be the first statement in a child constructor.
        // It invokes the matching constructor of the Parent (Vehicle) class.
        super(brand, speed);

        this.numberOfDoors = numberOfDoors;
        // Shadowing demonstration: parent's brand vs child's brand
        this.brand = brand + " (Car Subtype)";

        System.out.println("Car: Parameterized Constructor called.");
    }

    /**
     * Overloaded Constructor within the child class
     */
    public Car(String brand) {
        // 'this(...)' delegates to Car(String, int, int)
        this(brand, 60, 4);
        System.out.println("Car: Overloaded single-argument Constructor called.");
    }

    /**
     * Method Overriding: Replaces the behavior of Vehicle's startEngine()
     */
    @Override
    public void startEngine() {
        // Invoke the parent class's version of startEngine() using super
        super.startEngine();
        System.out.println("Car: Push-button ignition active. Ready to drive!");
    }

    /**
     * Displays details illustrating the difference between 'this' and 'super'
     */
    @Override
    public void displayInfo() {
        // Calls Vehicle's displayInfo()
        super.displayInfo();

        System.out.println("Car Doors: " + this.numberOfDoors);
        System.out.println("Child Brand (this.brand): " + this.brand);

        // 'super.brand' accesses the 'brand' variable defined in Vehicle
        System.out.println("Parent Brand (super.brand): " + super.brand);
    }
}

/**
 * Main Class to execute and demonstrate concepts
 */
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("--- 1. Creating a Car via Overloaded Constructor ---");
        Car myCar = new Car("Tesla");

        System.out.println("\n--- 2. Displaying Info (this vs super) ---");
        myCar.displayInfo();

        System.out.println("\n--- 3. Method Overriding & Super Method Calls ---");
        myCar.startEngine();

        System.out.println("\n--- 4. Polymorphism in Action ---");
        // Parent reference pointing to a Child object
        Vehicle polyCar = new Car("BMW", 120, 2);
        
        // Executes Car's overridden startEngine() at runtime
        polyCar.startEngine(); 
    }
}