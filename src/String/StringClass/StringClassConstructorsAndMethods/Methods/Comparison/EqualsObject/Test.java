package String.StringClass.StringClassConstructorsAndMethods.Methods.Comparison.EqualsObject;

public class Test
{
    void checkObject(Object o)
    {
        if(this==o)
        {
            System.out.println("matched");
        }
        else {
            System.out.println("Did not match");
        }
        System.out.println("this  : " +this);
    }
    public static void main(String[] args)
    {

        Test t = new Test();
        t.checkObject(t);
        System.out.println("Object created in main method : "+t);
    }
}
