package OOPs.StaticMethodsAndStaticNestedClass.StaticMethods.Example2;

public class StaticMethodDemo
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show1(); // Calling non static method with object


        /*
        // Calling static method without object.
        Here we need the class to call the non-static method.
        We cannot call the static method without the class
        since the static method is present in a different class
         */
        A.show2();
//        show2();
    }
}
