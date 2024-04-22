package OOPs.SuperKeyword.Examples.Example2.Example22;

import OOPs.SuperKeyword.Examples.Example2.Example22.A;

public class B extends A
{
    void show()
    {
        System.out.println("in class B start");
        super.show();
        System.out.println("In class B end");
    }
    void m1()
    {
        System.out.println("======");
        super.show();
        System.out.println("======");
    }
}
