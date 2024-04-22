package OOPs.StaticMethodsAndStaticNestedClass.StaticMethods.Example4;

public class A
{
//    int a = 10; // Cannot use non static instance variable inside static method
    static int a = 10; // static variable can be used within static method

    static void show()
    {
        System.out.println(a);
    }
}
