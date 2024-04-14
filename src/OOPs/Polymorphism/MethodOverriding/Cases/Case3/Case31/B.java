package OOPs.Polymorphism.MethodOverriding.Cases.Case3.Case31;

public class B extends A
{
    public Child show()
    {
        System.out.println("In Class B");
        return new Child();
    }
}
