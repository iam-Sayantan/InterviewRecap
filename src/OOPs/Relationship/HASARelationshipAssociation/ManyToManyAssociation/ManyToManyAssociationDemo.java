package OOPs.Relationship.HASARelationshipAssociation.ManyToManyAssociation;

public class ManyToManyAssociationDemo
{
    public static void main(String[] args)
    {
        Language bengali = new Language("BANGLA","123");
        Language hindi = new Language("HINDI","234");
        Language english = new Language("ENGLISH","345");

        Language[] l1 = {bengali,hindi};
        Language[] l2 = {english,bengali};
        Language[] l3 = {english,hindi};

        System.out.println("===================");
        Person p1 = new Person("ABC",l1);
        p1.showDetails();
        System.out.println("===================");
        Person p2 = new Person("XYZ",l2);
        p2.showDetails();
        System.out.println("===================");
        Person p3 = new Person("ASD",l3);
        p3.showDetails();
        System.out.println("===================");
        Person p4 = new Person("QEW",l2);
        p4.showDetails();
        System.out.println("===================");
        Person p5 = new Person("sdasd",l2);
        p5.showDetails();
        System.out.println("===================");

    }
}
