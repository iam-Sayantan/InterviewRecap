package OOPs.ClassesObjectsAndMethods;

public class Animal3
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
        Animal3 cat = new Animal3();

        System.out.println(cat.age);
        System.out.println(cat.color);

        cat.eat();
        cat.run();
    }
}
