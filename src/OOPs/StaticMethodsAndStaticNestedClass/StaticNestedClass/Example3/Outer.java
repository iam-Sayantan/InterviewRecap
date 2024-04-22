package OOPs.StaticMethodsAndStaticNestedClass.StaticNestedClass.Example3;

public class Outer
{
    private static int a = 10;
    int b = 20;
    static class Inner
    {
        void show()
        {
            System.out.println(a);
//            System.out.println(b); // Cannot access instance variables in static nested class
        }
    }
}
