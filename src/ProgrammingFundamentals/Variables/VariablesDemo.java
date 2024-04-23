package ProgrammingFundamentals.Variables;

public class VariablesDemo {

    int a = 100; // Instance Variable

    static int b = 20; // Static variable

    public void add()
    {
        int c = 20; // Local Variable
        int d = 30; // Local Variable
        System.out.println(c+d);
    }

    public static void multiply()
    {
        int e = 50; // e is now a local variable
        System.out.println(e);
    }

}
