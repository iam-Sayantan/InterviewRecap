package OOPs.Interfaces.Examples.Example1;

public class Scooter implements Vehicle
{
    @Override
    public void start() {
        System.out.println("Scooter starts with kick");
    }

    @Override
    public void changeGear(int gears) {
        System.out.println("Scooter has "+gears+" gears");
    }
}
