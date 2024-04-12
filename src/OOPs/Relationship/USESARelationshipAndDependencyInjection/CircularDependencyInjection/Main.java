package OOPs.Relationship.USESARelationshipAndDependencyInjection.CircularDependencyInjection;

public class Main
{
    public static void main(String[] args)
    {
        A ob1 = new A();
        B ob2 = new B();

        ob1.setB(ob2);
        ob2.setA(ob1);
    }
}
