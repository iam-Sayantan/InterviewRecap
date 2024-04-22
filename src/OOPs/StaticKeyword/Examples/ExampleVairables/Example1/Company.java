package OOPs.StaticKeyword.Examples.ExampleVairables.Example1;

public class Company
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(101,"Sayantan");
        Employee e2 = new Employee(102, "Aritra");
        Employee e3 = new Employee(103,"Subho");

        System.out.println();
        e1.display();
        System.out.println();
        e2.display();
        System.out.println();
        e3.display();
    }
}
