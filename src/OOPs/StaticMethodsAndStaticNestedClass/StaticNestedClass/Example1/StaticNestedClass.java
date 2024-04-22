package OOPs.StaticMethodsAndStaticNestedClass.StaticNestedClass.Example1;

public class StaticNestedClass
{
    public static void main(String[] args)
    {
        Outer obj1 = new Outer();
        Outer.Inner obj2 = obj1.new Inner();

        obj2.show(); // calling normal inner class

        Outer.NewInner obj3 = new Outer.NewInner();
        obj3.display(); // calling static inner class or static nested class

    }
}
