package OOPs.Relationship.HASARelationshipAssociation.ManyToOneAssociation;

public class ManyToManyAssociationDemo
{
    public static void main(String[] args)
    {
        Branch b1 = new Branch("XYZ","123");

        Student s1 = new Student("A","1",b1);
        Student s2 = new Student("B","2",b1);
        s1.showDetails();
        s2.showDetails();
    }
}
