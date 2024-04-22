package OOPs.StaticKeyword.Examples.ExampleVairables.Example2.Example22;

public class StaticLocalVariableExample {

    // Method to demonstrate why static local variables are not allowed
    public void printNumbers() {
        // Static local variable - Not allowed in Java
        // static int counter = 0; // This line would cause a compilation error

        // Local variable within method scope
        int counter = 0; // Each invocation of the method creates a new instance of 'counter'

        // Print numbers from 1 to 5
        for (int i = 0; i < 5; i++) {
            counter++; // Increment the local variable 'counter'
            System.out.println("Number: " + counter);
        }
    }

    public static void main(String[] args) {
        StaticLocalVariableExample example = new StaticLocalVariableExample();

        // Invoking the method multiple times
        example.printNumbers(); // Prints numbers from 1 to 5
        example.printNumbers(); // Prints numbers from 1 to 5 again
    }
}
