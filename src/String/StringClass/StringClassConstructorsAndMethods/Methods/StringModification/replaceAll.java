package String.StringClass.StringClassConstructorsAndMethods.Methods.StringModification;


public class replaceAll
{
    public static void main(String[] args) {
        String str = "Hello world to java";
        System.out.println(str.replaceAll("\\s","-"));
    }

    /*
This line is where the key operation happens.
The replaceAll method is called on the string str.
It takes two arguments:
The first argument is a regular expression \\s, which matches any whitespace character (spaces, tabs, newlines, etc.).
The second argument is the string "-", which is what every matched whitespace character will be replaced with.
 */

}
