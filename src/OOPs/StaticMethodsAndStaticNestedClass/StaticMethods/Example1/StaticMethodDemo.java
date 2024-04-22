package OOPs.StaticMethodsAndStaticNestedClass.StaticMethods.Example1;

public class StaticMethodDemo {
    // Instance method (non-static method)
    void show1() {
        System.out.println("1 - Non Static Method");
    }

    // Static method
    static void show2() {
        System.out.println("2 - Static Method");
    }

    public static void main(String[] args) {
        // Creating an object of the class
        StaticMethodDemo obj = new StaticMethodDemo();

        // Calling the instance method using object reference
        obj.show1(); // calling concrete method with object

        // Calling the static method directly (without object)
        show2(); // calling static method without object
        StaticMethodDemo.show2(); // We can also call the method with class
    }
}
