package OOPs.NestedClass.Types.MethdLocalInnerClass.Example2;

public class Outer
{
    void show1()
    {
        System.out.println("Inside Outer class");
        class Inner
        {
            void show2()
            {
                System.out.println("Inside inner class method of outer class method");
            }
        }
    }
    void show3()
    {
//        Inner innerOb = new Inner(); // Error: Inner class is not accessible here
//        innerOb.show2();
    }
}
