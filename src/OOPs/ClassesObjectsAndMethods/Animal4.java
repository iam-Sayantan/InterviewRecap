package OOPs.ClassesObjectsAndMethods;

public class Animal4
{
        int age;
        String color;

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
            Animal4 horin = new Animal4();
            horin.age=2;
            horin.color="white";

            System.out.println(horin.age);
            System.out.println(horin.color);

            horin.eat();
            horin.run();

            System.out.println("==================");

            Animal4 jimmy = new Animal4();
            jimmy.age=5;
            jimmy.color="brown&white";

            System.out.println(jimmy.age);
            System.out.println(jimmy.color);

            jimmy.eat();
            jimmy.run();
        }
}
