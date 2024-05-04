package OOPs.thisKeyword.Examples.Example6;

public class Test
{
    void m1()
    {
        System.out.println("1");
        m2(this); // Calls method m2 with the current object as an argument
    }
    void m2(Test t) // Method m2 with parameter of type Test
    {
        System.out.println("2");
        System.out.println(t); // Prints the object reference passed as argument
    }
}
