package OOPs.Polymorphism.MethodOverloading.Cases.Case3.Case3B;

public class MethodOverloadingCase3
{
    public static void main(String [] args)
    {
        Test t = new Test();
//        t.display(null);
        t.display(new StringBuilder("Sayantan"));
        t.display(new Object());
    }
}
