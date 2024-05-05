package String.StringClass.StringClassConstructorsAndMethods.Methods.Misc;

public class ToCharArray {
    public static void main(String[] args) {
        String str = "Hello, world!";
        // Convert the string to a character array
        char[] characters = str.toCharArray();

        // Print each character in the array
        for (char c : characters) {
            System.out.print(c + " ");
        }
    }

}


