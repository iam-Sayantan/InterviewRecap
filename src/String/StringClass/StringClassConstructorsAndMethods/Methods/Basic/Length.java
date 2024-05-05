package String.StringClass.StringClassConstructorsAndMethods.Methods.Basic;

public class Length
{
    public int length(String str)
    {
        // Returns the length of the string.
        return str.length();
    }

    public static void main(String[] args)
    {
        Length obj = new Length();
        System.out.println(obj.length("Kolkata"));
    }
}
