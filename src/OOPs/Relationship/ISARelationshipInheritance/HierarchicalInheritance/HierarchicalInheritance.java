package OOPs.Relationship.ISARelationshipInheritance.HierarchicalInheritance;

public class HierarchicalInheritance
{
    public static void main(String[] args)
    {

        System.out.println("===============");

        A ob1 = new A();
        ob1.show1();

        System.out.println("===============");

        B ob2 = new B();
        ob2.show1();
        ob2.show2();
        // ob2.show3();

        System.out.println("===============");

        C ob3 = new C();
        ob3.show1();
        // ob3.show2();
        ob3.show3();

        System.out.println("===============");

    }
}
