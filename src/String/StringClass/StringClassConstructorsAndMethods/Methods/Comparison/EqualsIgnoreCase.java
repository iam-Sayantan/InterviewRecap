package String.StringClass.StringClassConstructorsAndMethods.Methods.Comparison;

public class EqualsIgnoreCase
{
    public boolean EqualsIgnoreCase(String str)
    {
        return str.equalsIgnoreCase("SAYANTAN");
    }

    public static void main(String[] args)
    {
        EqualsIgnoreCase obj = new EqualsIgnoreCase();
        System.out.println(obj.EqualsIgnoreCase("Sayantan"));
    }
}
