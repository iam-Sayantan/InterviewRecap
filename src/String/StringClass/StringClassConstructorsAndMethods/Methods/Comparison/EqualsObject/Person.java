package String.StringClass.StringClassConstructorsAndMethods.Methods.Comparison.EqualsObject;

public class Person {
    private String name; // Field to store the name of the person

    public Person(String name) {
        this.name = name; // Constructor to set the name of the person
    }

    void display(Object obj)
    {
        Person person = (Person) obj;


        if(person == obj)
        {
            System.out.println(this.name+ " Matched "+((Person) obj).name);
        }
        else
        {
            System.out.println(this.name+" Unmatched "+((Person) obj).name);
        }
    }

    // Override the equals method to compare Person objects based on the name field
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//        {
//            return true; // Check if the references are the same
//        }
//        if (obj == null || getClass() != obj.getClass())
//        {
//            return false; // Check for null and ensure the same class
//        }
//
//        Person person = (Person) obj; // Type casting
//        return name.equals(person.name); // Compare names for equality
//    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Alice");
//        Person person3 = new Person("Bob");

//        System.out.println(person1.equals(person2)); // Should print true because names are the same
//        System.out.println(person1.equals(person3)); // Should print false because names are different

        person1.display(person1);
//        person1.display(person2);
    }
}

