package OOPs.Polymorphism.MethodOverriding.Example2;

public class MethodOverridingDemo
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        obj1.show1();

        B obj2 = new B();
        obj2.show2();

        A obj3 = new B();
        obj3.show1();
    }
}
