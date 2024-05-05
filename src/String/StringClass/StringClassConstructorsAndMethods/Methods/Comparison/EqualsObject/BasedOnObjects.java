package String.StringClass.StringClassConstructorsAndMethods.Methods.Comparison.EqualsObject;

public class BasedOnObjects
{
    public static void main(String[] args) {

        Dog myDog = new Dog("Jimmy");
        Dog newDog = new Dog("Jimmy");

        System.out.println("Using ==");
        // using ==
        if (myDog==newDog)
        {
            System.out.println(myDog.name+" reference matched "+newDog.name);
            System.out.println(myDog);
            System.out.println(newDog);
        }
        else {
            System.out.println(myDog.name+" reference did not match "+newDog.name);
            System.out.println(myDog);
            System.out.println(newDog);
        }

        System.out.println("-----------------------------");

        System.out.println("Using equals() method");
        if (myDog.equals(newDog))
        {
            System.out.println(myDog.name+" reference matched "+newDog.name);
            System.out.println(myDog);
            System.out.println(newDog);
        }
        else {
            System.out.println(myDog.name+" reference did not match "+newDog.name);
            System.out.println(myDog);
            System.out.println(newDog);
        }

        System.out.println("===================");

        // Check if content same
        if (myDog.name==newDog.name)
        {
            System.out.println(myDog.name+" matched "+newDog.name);
            System.out.println(myDog);
            System.out.println(newDog);
        }
        else {
            System.out.println(myDog.name+" did not match "+newDog.name);
            System.out.println(myDog);
            System.out.println(newDog);
        }

    }

}

class Dog
{
    String name;

    Dog(String name)
    {
        this.name=name;
    }

}
