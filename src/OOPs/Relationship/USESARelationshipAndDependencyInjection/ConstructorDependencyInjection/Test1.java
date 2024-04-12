package OOPs.Relationship.USESARelationshipAndDependencyInjection.ConstructorDependencyInjection;

public class Test1
{
    String t1;
    public Test1(Test2 test2)
    {
        System.out.println("Using Test2 object inside constructor of Test1");
    }
}
