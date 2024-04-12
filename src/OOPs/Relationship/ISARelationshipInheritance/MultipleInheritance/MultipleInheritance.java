package OOPs.Relationship.ISARelationshipInheritance.MultipleInheritance;

public class MultipleInheritance
{
    public static void main(String[] args)
    {
        System.out.println("=============");

        C obj = new C();
        obj.show(); // Ambiguity error: If Java allowed this, which show() method should be invoked? A's or B's?
        // This would be a major issue because Java cannot decide on its own which superclass method to call,
        // leading to ambiguity and potentially unexpected behavior.

        System.out.println("=============");

    }
}
