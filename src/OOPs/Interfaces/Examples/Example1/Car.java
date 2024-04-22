package OOPs.Interfaces.Examples.Example1;

public class Car implements Vehicle
{
    @Override
    public void start() {
        System.out.println("Car start with keys");
    }

    @Override
    public void changeGear(int gears) {
        System.out.println("Car has "+gears+" gears");
    }
}
