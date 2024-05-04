package String.StringClassConstructorsAndMethods.Methods.StringModification;

public class replaceFirst
{
    public static void main(String[] args) {
        String str = "Hello world to java";

        // Replace the first occurrence of a whitespace character with a hyphen
        System.out.println(str.replaceFirst("\\s", "-"));
    }
}
