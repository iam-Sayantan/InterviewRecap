package OOPs.Relationship.ISARelationshipInheritance.SingleInheritance;

public class SingleInheritance
{
    public static void main(String[] args)
    {
        System.out.println("=====================");

        A ob1 = new A();
        ob1.show1();

        System.out.println("=====================");

        B ob2 = new B();
        ob2.show1();
        ob2.show2();

        System.out.println("=====================");
    }
}
