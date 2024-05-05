package String.StringClass.StringClassConstructorsAndMethods.Methods.Comparison;

public class CompareTo
{
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";
        String str4 = "Apple"; // Note the uppercase 'A'

        System.out.println(str1.compareTo(str2)); // Will print a negative number because 'a' is less than 'b'
        System.out.println(str1.compareTo(str3)); // Will print 0 because both strings are identical
        System.out.println(str1.compareTo(str4)); // Will print a positive number because lowercase 'a' > uppercase 'A'
        System.out.println(str4.compareTo(str1)); // Will print a negative number because uppercase 'A' is less than lowercase 'a'
    }
}
