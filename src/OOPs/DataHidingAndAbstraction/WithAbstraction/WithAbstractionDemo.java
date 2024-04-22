package OOPs.DataHidingAndAbstraction.WithAbstraction;

public class WithAbstractionDemo
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.start();

        System.out.println("===============");

        Scooter scooter = new Scooter();
        scooter.start();
    }
}
