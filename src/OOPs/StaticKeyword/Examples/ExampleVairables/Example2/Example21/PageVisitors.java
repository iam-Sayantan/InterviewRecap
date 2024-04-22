package OOPs.StaticKeyword.Examples.ExampleVairables.Example2.Example21;

public class PageVisitors
{
    static int count=0;
    PageVisitors()
    {
        count = count+1;
        System.out.println("Visitor :: "+count);
    }
    void numberOfVisitors()
    {
        System.out.println(count);
    }
}
