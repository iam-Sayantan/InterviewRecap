package String.StringClass.StringClassConstructorsAndMethods.Methods.Misc;

public class Intern {
    public static void main(String[] args) {



        // Creating two distinct string objects
        String s1 = new String("Java");
        String s2 = new String("Java");

        // Checking references before interning
        System.out.println("Before interning:");
        System.out.println("s1 == s2: " + (s1 == s2)); // This will print false

         /*
        The contents of s1 and s2 are indeed the same ("Java") in your example,
        but the reason s1 == s2 returns false before using the intern() method has to do with how Java handles string objects and memory.

        Java String Memory Handling:
        Distinct Objects: When you use the new String("Java") syntax,
        you explicitly create a new string object in the heap memory every time, regardless of the content.
        This means that each new String("Java") is a completely new and independent object with its own memory address.

        Reference Comparison (==): The == operator in Java compares the references (i.e., the memory addresses) of the objects,
        not their contents. Because s1 and s2 are two separate objects located at different addresses in memory (each created via a new keyword), s1 == s2 evaluates to false.
        They are not the same object from the perspective of the == operator.
         */

        // Interning the strings
        s1 = s1.intern();
        s2 = s2.intern();

        // Checking references after interning
        System.out.println("After interning:");
        System.out.println("s1 == s2: " + (s1 == s2)); // This will print true
    }
}
