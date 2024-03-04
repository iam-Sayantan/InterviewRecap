package ProgrammingFundamentals.Variables;

public class VariableScopeExample {

    // Instance variable: belongs to an instance of the class.
    private int instanceVariable;

    // Static variable: shared among all instances of the class.
    private static int staticVariable;

    public VariableScopeExample() {
        // Constructor: can access both instance and static variables.
        instanceVariable = 1;
        staticVariable = 2;
    }

    public void methodExample() {
        // Local variable: scope is limited to this method.
        int localVariable = 3;

        // Accessing instance and static variables within a method.
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Local variable: " + localVariable);
    }

    public static void main(String[] args) {
        VariableScopeExample example = new VariableScopeExample();

        // Static methods can only directly access static variables.
        System.out.println("Accessing static variable from main: " + staticVariable);

        // Access instance method, which in turn accesses instance and local variables.
        example.methodExample();
    }
}
