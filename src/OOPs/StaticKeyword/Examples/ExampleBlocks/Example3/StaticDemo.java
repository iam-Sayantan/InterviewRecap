package OOPs.StaticKeyword.Examples.ExampleBlocks.Example3;

public class StaticDemo
{
    static
    {
        System.out.println("In Static Block 1");
    }
    public static void main(String[] args)
    {
        System.out.println("Main Method");
    }
    static
    {
        System.out.println("In Static Block 2");
    }
}
