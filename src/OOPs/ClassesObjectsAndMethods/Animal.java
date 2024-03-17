package OOPs.ClassesObjectsAndMethods;

public class Animal {

    int age = 10;
    String color = "black";

    void eat()
    {
        System.out.println("I am eating");
    }

    public static void main(String[] args)
    {
        //System.out.println("Hello");
        Animal dog = new Animal();
        System.out.println(dog.age);
        System.out.println(dog.color);

        dog.eat();

        System.out.println("==================");

        Birds crow = new Birds();
        crow.fly();
    }
}
