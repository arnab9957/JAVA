/**
 * Interface defining a contract for payable entities.
 * Demonstrates abstraction combined with polymorphism.
 */
interface Payable {
    double calculatePay();
}

/**
 * Base Class: Employee
 */
class Employee implements Payable {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Default implementation for interface method
    @Override
    public double calculatePay() {
        return baseSalary;
    }

    // Parent implementation of work summary
    public void performWork() {
        System.out.println(name + " is performing general administrative tasks.");
    }

    // =========================================================================
    // COMPILE-TIME POLYMORPHISM (Method Overloading)
    // Same method name 'logHours', different parameter lists.
    // =========================================================================
    
    /** Overload 1: Takes regular hours */
    public void logHours(double hours) {
        System.out.println(name + " logged " + hours + " regular hours.");
    }

    /** Overload 2: Takes regular hours and overtime hours */
    public void logHours(double regularHours, double overtimeHours) {
        System.out.println(name + " logged " + regularHours + " regular hours and " 
                + overtimeHours + " overtime hours.");
    }
}

/**
 * Child Class 1: Developer
 */
class Developer extends Employee {
    private double projectBonus;

    public Developer(String name, double baseSalary, double projectBonus) {
        super(name, baseSalary);
        this.projectBonus = projectBonus;
    }

    // =========================================================================
    // RUN-TIME POLYMORPHISM (Method Overriding)
    // Redefines parent methods to provide developer-specific behavior.
    // =========================================================================
    
    @Override
    public double calculatePay() {
        return getBaseSalary() + projectBonus;
    }

    @Override
    public void performWork() {
        System.out.println(getName() + " is writing and debugging code.");
    }
}

/**
 * Child Class 2: Manager
 */
class Manager extends Employee {
    private double incentiveBonus;

    public Manager(String name, double baseSalary, double incentiveBonus) {
        super(name, baseSalary);
        this.incentiveBonus = incentiveBonus;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() + incentiveBonus;
    }

    @Override
    public void performWork() {
        System.out.println(getName() + " is planning project sprints and managing team tasks.");
    }
}

/**
 * Main Class to execute polymorphic behaviors
 */
public class Polymorphism {

    // Helper method demonstrating Polymorphic Parameters
    // Accepts ANY object that implements Payable
    public static void printPayrollReceipt(Payable recipient) {
        System.out.printf("Payout Amount: $%.2f%n", recipient.calculatePay());
    }

    public static void main(String[] args) {
        System.out.println("=== 1. COMPILE-TIME POLYMORPHISM (Method Overloading) ===");
        Employee emp = new Employee("Alice", 50000);
        
        // Compiler selects the method signature based on arguments provided
        emp.logHours(40.0);
        emp.logHours(40.0, 5.5);


        System.out.println("\n=== 2. RUN-TIME POLYMORPHISM (Method Overriding) ===");
        
        // Superclass references pointing to Subclass objects
        Employee dev = new Developer("Bob", 80000, 12000);
        Employee mgr = new Manager("Charlie", 95000, 15000);

        // Dynamic Method Dispatch:
        // The JVM resolves which performWork() to call at RUNTIME based on actual object type
        dev.performWork(); // Calls Developer's performWork()
        mgr.performWork(); // Calls Manager's performWork()


        System.out.println("\n=== 3. POLYMORPHIC COLLECTIONS & INTERFACES ===");
        
        // Polymorphic Array: Storing subclass instances under superclass reference
        Employee[] team = { emp, dev, mgr };

        for (Employee member : team) {
            member.performWork();
            // Interface-based polymorphic parameter call
            printPayrollReceipt(member);
            System.out.println("---");
        }
    }
}