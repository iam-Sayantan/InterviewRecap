package OOPs.thisKeyword.Examples.Example5ConstructorChaining;

public class Test
{
    Test() // Default constructor
    {
        this(10); // Calls the parameterized constructor with an integer argument
        System.out.println("In Default Constructors");
    }
    Test(int a) // Parameterized constructor with an integer argument
    {
        this("abc"); // Calls another constructor with a String argument
        System.out.println(a);
    }
    Test(String a)  // Parameterized constructor with a String argument
    {
        System.out.println(a); // Prints the value of the String argument
    }
}
