package OOPs.thisKeyword.Examples.Example4;

public class ThisDemo
{
    ThisDemo()
    {
        System.out.println("1");
    }
    ThisDemo(int no)
    {
        this(); // Using "this" keyword to invoke the default constructor: This comment accurately explains the usage of the this keyword to invoke the default constructor within the parameterized constructor.
        System.out.println("2");
    }
    public static void main(String[] args)
    {
//        ThisDemo obj1 = new ThisDemo(); // We don't need to call the default constructor explicitly like this.
        ThisDemo obj2 = new ThisDemo(10);
    }
}
