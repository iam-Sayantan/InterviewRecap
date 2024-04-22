package OOPs.NestedClass.Types.AnonymousInnerClass.Example2;

public class AnonymousInnerClass
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Starts with key");
            }
        };
        vehicle.start();
    }
}
