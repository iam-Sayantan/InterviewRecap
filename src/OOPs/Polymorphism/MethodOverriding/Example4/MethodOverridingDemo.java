package OOPs.Polymorphism.MethodOverriding.Example4;

public class MethodOverridingDemo
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        obj1.show(1);

        B obj2 = new B();
        obj2.show("as");

        A obj3 = new B();
//        obj3.show("abc");
        obj3.show(10);
    }
}
