package OOPs.Polymorphism.MethodOverloading.Cases.Case2;

public class MethodOverloadingCase2
{
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.display();
        obj.display(10);
        obj.display(10,20);
        obj.display(10,20,30);
        obj.display(10,20,30,40);
    }
}
