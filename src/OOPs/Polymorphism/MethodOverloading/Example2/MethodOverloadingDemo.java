package OOPs.Polymorphism.MethodOverloading.Example2;

public class MethodOverloadingDemo
{
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.sum();
        obj.sum(1,2);
        obj.sum("a");
        obj.sum(1,"a");
        obj.sum(2.1f,3.1f);
        obj.sum("aa",1);
    }
}
