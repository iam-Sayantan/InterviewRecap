package OOPs.FinalKeyword.Examples.Example2;

public class B extends A {
    /*
    Without final method m1 in class A
    This method overrides the m1() method from class A.
    */
    void m1() {
        System.out.println("In class B");
    }

    /*
    With final method m2 in class A
    Uncommenting this method will result in a compilation error since you cannot override a final method.

    void m2() {
        System.out.println("In m2 method of class B");
    }
    */
}