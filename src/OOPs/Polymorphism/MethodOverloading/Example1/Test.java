package OOPs.Polymorphism.MethodOverloading.Example1;

public class Test
{
    void display()
    {
        System.out.println("Inside No Parameters method");
    }
    void display(int a)
    {
        System.out.println("Inside display method calling single int parameter");
    }
    void display(int a, int b)
    {
        System.out.println("Inside display method calling two int parameters");
    }
}
