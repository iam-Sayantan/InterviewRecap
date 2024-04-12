package OOPs.Polymorphism.MethodOverloading.Example1;

public class MethodOverloadingDemo
{
    public static void main(String[] args)
    {
        Test t = new Test();
        t.display();
        t.display(20);
        t.display(20,30);
    }
}
