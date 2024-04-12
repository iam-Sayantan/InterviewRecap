package OOPs.Constructors;

public class Animal
{
    int age;
    String color;

    int legs;
    String name;

    public Animal(String name, int legs)
    {
        this.legs=legs;
        this.name=name;
    }

    public Animal(int age1, String color1)
    {
        age=age1;
        color=color1;
    }

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
        Animal tiger = new Animal(10, "red");
        System.out.println(tiger.age);
        System.out.println(tiger.color);
        tiger.eat();
        tiger.run();

        System.out.println("=================================");

        Animal lion = new Animal(23,"yellow");
        System.out.println(lion.age);
        System.out.println(lion.color);
        lion.eat();
        lion.run();
    }

}
