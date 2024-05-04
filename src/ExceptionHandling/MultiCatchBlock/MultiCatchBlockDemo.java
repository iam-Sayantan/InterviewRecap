package ExceptionHandling.MultiCatchBlock;

public class MultiCatchBlockDemo {
    public static void main(String[] args) {
        try {
            // Attempting division by zero
            System.out.println(100 / 0);

            // Attempting to access an element beyond array boundary
            int[] a = {10, 20, 30, 40, 50};
            System.out.println(a[5]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Handling multiple exceptions in a single catch block
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
            System.out.println("Error message: " + e.getMessage());
        }
    }
}
