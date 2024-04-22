package OOPs.FinalKeyword.Examples.Example2;

public class FinalDemo {
    public static void main(String[] args) {
        A obj = new B();
        obj.m1(); // This will call the m1() method of class B, due to dynamic method dispatch
        // obj.m2(); // Uncommenting this line would result in a compilation error due to attempting to override a final method.
    }
}