package OOPs.StaticKeyword.Examples.ExampleBlocks.Example2;

public class StaticDemo
{
    static
    {
        System.out.println("In static block staticDemo");
    }

    public static void main(String[] args)
    {
        A ob = new A();
        System.out.println("Main Method");
    }
}
