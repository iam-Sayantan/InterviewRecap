package String.StringClass.StringClassConstructorsAndMethods.Methods.Basic;

public class codePointCount
{
    public int codePointCount(String str)
    {
        return str.codePointCount(0,str.length());
    }

    public static void main(String[] args) {
        codePointCount obj = new codePointCount();
        System.out.println(obj.codePointCount("Hello :) "));
    }
}
