package String.StringClassConstructorsAndMethods.Methods.Basic;

public class codePointBefore
{
    public int codePointBefore(String str)
    {
        return str.codePointBefore(1);
    }

    public static void main(String[] args)
    {
        codePointBefore obj = new codePointBefore();
        System.out.println(obj.codePointBefore("Sayantan"));
    }
}
