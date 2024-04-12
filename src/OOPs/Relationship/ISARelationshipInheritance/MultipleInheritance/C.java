package OOPs.Relationship.ISARelationshipInheritance.MultipleInheritance;

// Class C attempting to inherit from both A and B
// This is incorrect in Java because Java does not support multiple inheritance through classes.
// The line below will cause a compilation error because of the attempt to extend multiple classes.
//class C extends A, B { // This line is syntactically incorrect in Java

class C extends A
{
    public void showC()
    {
        System.out.println("In Class C");
    }
}