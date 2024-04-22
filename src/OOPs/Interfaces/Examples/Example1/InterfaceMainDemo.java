package OOPs.Interfaces.Examples.Example1;

public class InterfaceMainDemo
{
    public static void main(String[] args)
    {
//            Vehicle obj = new Vehicle(); // We cannot create object of an interface
        Bus bus = new Bus();
        bus.start();
        bus.changeGear(6);
    }
}
