package OOPs.Interfaces.Examples.Example1;

public class Bus implements Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Bus starts with key");
    }

    @Override
    public void changeGear(int gears) {
        System.out.println("Bus has "+gears+" gears");
    }


}
