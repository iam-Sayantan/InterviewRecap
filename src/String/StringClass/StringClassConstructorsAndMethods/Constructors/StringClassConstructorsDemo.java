package String.StringClass.StringClassConstructorsAndMethods.Constructors;

public class StringClassConstructorsDemo
{
    public static void main(String[] args)
    {
        String str1 = new String();
        System.out.println(str1);

        String str2 = new String("Sayantan");
        System.out.println(str2);

        byte[] b= {97,98,99,100,110};
        String str3 = new String(b);
        System.out.println(str3);

        char[] c = {'a','b'};
        String str4 = new String(c);
        System.out.println(c);


    }
}
