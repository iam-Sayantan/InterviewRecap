package OOPs.thisKeyword.Examples.Example3;

/*

    invoke current class method

 */

public class ThisDemo
{
    void m1()
    {
        System.out.println("In m1 method");
        m2(); // Compiler is doing "this.m2()" to call the m2 method behind the scenes
        this.m2(); // To test if "this.m2()" is invoking current class method
    }

    void m2()
    {
        System.out.println("In m2 method");
    }

    public static void main(String[] args)
    {
        ThisDemo obj = new ThisDemo();
        obj.m1();
    }
}
