package String.StringClass.StringClassConstructorsAndMethods.Methods.Comparison;

public class startsWith
{
    public static void main(String[] args)
    {
        String str1 = "Mr Sengupta";
        String str2 = "Mrs Sengupta";

        System.out.println(str1.startsWith("Mrs"));
        System.out.println(str2.startsWith("mr"));
        System.out.println(str1.startsWith("Mr"));
    }
}
