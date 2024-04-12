package OOPs.Relationship.USESARelationshipAndDependencyInjection.CircularDependencyInjection;

public class A
{
    B b1;
    public void setB(B b2)
    {
        b1 = b2;
    }
}
