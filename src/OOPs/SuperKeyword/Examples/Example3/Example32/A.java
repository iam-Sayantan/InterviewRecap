package OOPs.SuperKeyword.Examples.Example3.Example32;

public class A
{
    A() {
        System.out.println("In Class A constructor");
    }

    A(int a) {
        this(); // Call the no-args constructor from within the parameterized constructor
        System.out.println("In Class A parameterized constructor");
    }
}