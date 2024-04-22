package OOPs.thisKeyword.Examples.Example2;

public class ThisDemo
{
    int no = 10;

    void m1(int no)
    {
        System.out.println(this.no);
    }

    public static void main(String[] args)
    {
        ThisDemo obj = new ThisDemo();
        obj.m1(20);
        System.out.println(obj.no);
    }
}
