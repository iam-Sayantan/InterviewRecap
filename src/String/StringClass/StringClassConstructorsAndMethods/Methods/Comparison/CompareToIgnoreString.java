package String.StringClass.StringClassConstructorsAndMethods.Methods.Comparison;

public class CompareToIgnoreString
{
    public static void main(String[] args)
    {
        String str1 = "apple";
        String str2 = "Apple";
        String str3 = "banana";

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));
    }
}
