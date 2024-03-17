package OOPs.ClassesObjectsAndMethods;

public class Animal2
{
    int age=10;
    String color = "red";

    void eat()
    {
        System.out.println("I am eating");
    }

    void run()
    {
        System.out.println("I am running");
    }

    public static void main(String[] args)
    {
        Animal2 dog = new Animal2();

        System.out.println(dog.age);
        System.out.println(dog.color);

        dog.eat();
        dog.run();
    }
}
