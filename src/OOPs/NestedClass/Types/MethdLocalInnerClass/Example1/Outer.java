package OOPs.NestedClass.Types.MethdLocalInnerClass.Example1;

public class Outer {
    void show1() {
        System.out.println("In Outer class");

        // Method-local inner class
        class Inner {
            void show2() {
                System.out.println("Inside inner class of outer class method");
            }
        }

        // Creating an instance of the method-local inner class and invoking its method
        Inner innerOb = new Inner();
        innerOb.show2();
    }
}
