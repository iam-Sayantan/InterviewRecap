package String.StringClassConstructorsAndMethods.Methods.Utility;

public class format {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;

        // Create a formatted string with placeholders for a string ("%s") and an integer ("%d")
        String message = String.format("My name is %s and I am %d years old.", name, age);

        System.out.println(message);
    }
}

