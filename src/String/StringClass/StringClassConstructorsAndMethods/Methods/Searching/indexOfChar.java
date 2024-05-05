package String.StringClass.StringClassConstructorsAndMethods.Methods.Searching;

/*
Returns the index of the
first occurrence of the specified character.
 */

public class indexOfChar {
    public static void main(String[] args) {
        String str = "Hello, welcome to the world of Java.";

        // Using indexOfChar to find the first occurrence of 'o'
        int firstIndex = str.indexOf('o');
        System.out.println("First occurrence of 'o': " + firstIndex);

        // Using indexOfChar to find the first occurrence of 'o' starting from index 5
        int subsequentIndex = str.indexOf('o', 5);
        System.out.println("First occurrence of 'o' starting from index 5: " + subsequentIndex);
    }
}
