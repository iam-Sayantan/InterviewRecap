package OOPs.thisKeyword.Examples.Example1;

public class ThisDemo
{
    void m1()
    {
        System.out.println("in m1 method "+this);
    }
    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo();
        System.out.println("Value of object :: "+obj);
        obj.m1();
    }
}
