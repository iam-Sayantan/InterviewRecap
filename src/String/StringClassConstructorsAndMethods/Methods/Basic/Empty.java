package String.StringClassConstructorsAndMethods.Methods.Basic;

public class Empty 
{
    public boolean isEmpty(String str)
    {
        // Checks if the string is empty.
        return str.isEmpty();
    }

    public static void main(String[] args) 
    {
        String testString="";
        Empty obj = new Empty();
        if(obj.isEmpty(testString)==true)
        {
            System.out.println("String is empty");
        }
        else
        {
            System.out.println("String is not empty");
        }
    }
}
