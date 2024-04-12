package OOPs.Polymorphism.MethodOverloading.Cases.Case2;

public class Test
{
    void display(int a)
    {
        System.out.println("First method "+a);
    }
    void display(int... a)
    {
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
