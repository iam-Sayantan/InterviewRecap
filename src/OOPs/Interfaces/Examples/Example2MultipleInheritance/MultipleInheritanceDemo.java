package OOPs.Interfaces.Examples.Example2MultipleInheritance;

public class MultipleInheritanceDemo implements I1, I2
{
    @Override
    public void show() {
        System.out.println("In Multiple Inheritance Demo class");
    }

    public static void main(String[] args)
    {
        MultipleInheritanceDemo mid = new MultipleInheritanceDemo();
        mid.show();
    }
}

