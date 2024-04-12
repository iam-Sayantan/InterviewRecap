package OOPs.Relationship.USESARelationshipAndDependencyInjection.ConstructorDependencyInjection;

public class Main
{
    public static void main(String[] args)
    {
        Test2 obj1 = new Test2(100);
        Test1 obj2 = new Test1(obj1); // Constructor Dependency Injection
    }
}
