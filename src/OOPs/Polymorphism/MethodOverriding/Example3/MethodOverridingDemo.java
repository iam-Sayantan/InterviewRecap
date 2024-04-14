package OOPs.Polymorphism.MethodOverriding.Example3;

public class MethodOverridingDemo
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        obj1.show();

        B obj2 = new B();
        obj2.show();

        A obj3 = new B();
        obj3.show();
    }
}
