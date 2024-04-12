package OOPs.Polymorphism.MethodOverloading.Example2;

public class Test
{
    void sum()
    {
        System.out.println("No parameters");
    }
    void sum(int a, int b)
    {
        int res = a+b;
        System.out.println(res);
    }
    void sum(float a, float b)
    {
        float res = a+b;
        System.out.println(res);
    }
    void sum(String a)
    {
        System.out.println("Calling sum method with string parameter");
    }
    void sum(int a, String b)
    {
        System.out.println("Sequence is int and then String");
    }
    void sum(String a, int b)
    {
        System.out.println("Sequence is String and then int");
    }
}
