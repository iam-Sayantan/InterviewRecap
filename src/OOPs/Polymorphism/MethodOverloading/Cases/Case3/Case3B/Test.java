package OOPs.Polymorphism.MethodOverloading.Cases.Case3.Case3B;

public class Test
{
    void display(Object a)
    {
        System.out.println("First Method");
    }
    void display(String a)
    {
        System.out.println("Second Method");
    }
    void display(StringBuilder a)
    {
        System.out.println("Third Method");
    }
}
