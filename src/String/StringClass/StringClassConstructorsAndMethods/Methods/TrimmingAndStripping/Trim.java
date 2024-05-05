package String.StringClass.StringClassConstructorsAndMethods.Methods.TrimmingAndStripping;

public class Trim
{
    public static void main(String[] args) {
        String str = " Hello world to java ";
        System.out.println("Length before trimming :: "+str.length());
        str = str.trim();
        System.out.println("Length after trimming :: "+str.length());
    }
}
