package OOPs.Relationship.USESARelationshipAndDependencyInjection.SetterMethodDependencyInjection;

public class Main
{
    public static void main(String[] args)
    {
        A ob1 = new A();
        B ob2 = new B();
        ob2.setBb(ob1);
    }
}
