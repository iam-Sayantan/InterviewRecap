package String.StringClass.StringClassConstructorsAndMethods.Methods.Basic;

public class codePointAt
{
    public int codePoint(String str)
    {
        // Returns the Unicode code point at the specified index.
        return str.codePointAt(1);
    }

    public static void main(String[] args) {
        codePointAt obj = new codePointAt();

        System.out.println(obj.codePoint("Sayantan"));
    }
}
