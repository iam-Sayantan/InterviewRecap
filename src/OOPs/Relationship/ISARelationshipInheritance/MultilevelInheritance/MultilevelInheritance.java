package OOPs.Relationship.ISARelationshipInheritance.MultilevelInheritance;

public class MultilevelInheritance
{
    public static void main(String[] args)
    {
        System.out.println("=====================");

        A ob1 = new A();
        ob1.show1();
//        ob1.show2();
//        ob1.show3();

        System.out.println("=====================");

        B ob2 = new B();
        ob2.show1();
        ob2.show2();
//        ob2.show3();
        System.out.println( ob2.add(2,1));
        System.out.println(ob2.add(2,1,3));

        System.out.println("=====================");

        C ob3 = new C();
        ob3.show1();
        ob3.show2();
        ob3.show3();
        System.out.println(ob3.add(1,2));
        System.out.println(ob3.add(1,2,3));
        System.out.println(ob3.add(1,2,3,4));

        System.out.println("=====================");

    }
}
