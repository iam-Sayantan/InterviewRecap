package OOPs.FinalKeyword.Examples.Example1;

public class A {
    /*
    Without final keyword
    This method demonstrates a variable without the final keyword.
    It shows how a variable's value can be modified after initialization.
    */
    void m1() {
        int a = 10;
        a = a + 20; // Value of 'a' is modified after initialization
        System.out.println(a);
    }

    /*
    With Final keyword
    This method demonstrates the usage of the final keyword.
    It initializes a variable with the final keyword, preventing its value from being modified after initialization.
    */
    void m2() {
        final int b = 20;
        // b = b + 20; // Cannot assign a value to a final variable, compilation error
        System.out.println(b + 100); // Usage of 'b' in an expression, but 'b' itself is not modified
    }
}
