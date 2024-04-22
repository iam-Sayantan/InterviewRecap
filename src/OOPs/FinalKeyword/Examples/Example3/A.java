package OOPs.FinalKeyword.Examples.Example3;

/*
Without final class
public class A
{
    void display()
    {
        System.out.println("In Class A");
    }
}
 */

/*
With Final class (The class A is declared as final, which means it cannot be subclassed.)
*/
final public class A {
    void display() {
        System.out.println("In final class A");
    }
}
