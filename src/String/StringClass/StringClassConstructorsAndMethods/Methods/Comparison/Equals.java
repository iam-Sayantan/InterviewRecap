package String.StringClass.StringClassConstructorsAndMethods.Methods.Comparison;

public class Equals
{
    public static void main(String[] args) {

        String str1 = new String("Sayantan");
        String str2 = new String("Sayantan");

        System.out.println(str1==str2); // should be false
        System.out.println(str1.equals(str2)); // should be true

        String str3 = "Jimmy";
        String str4 = "Jimmy";

        System.out.println(str3==str4); // should be true
        System.out.println(str3.equals(str4)); // should be true


    }
}
