package String.StringClassConstructorsAndMethods.Methods.Basic;

public class charAt
{
    public char charAt(String str)
    {
        //Returns the character at the specified index.
        return str.charAt(1);
    }

    public static void main(String[] args)
    {
        charAt obj = new charAt();

        System.out.println("Char :: "+obj.charAt("Sayantan"));
    }
}
