package OOPs.NestedClass.Types.AnonymousInnerClass.Example1;

public class AnonymousInnerClassDemo
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle()
        {
            @Override
            void start() {
                System.out.println("Starts with key");
            }

            @Override
            void showName() {
                System.out.println("Tata Nexon");
            }
        };
        vehicle.start();
        vehicle.showName();
    }
}
