package OOPs.thisKeyword.Examples.Example7;

class Test1 {
    void m1() {
        // Inside method m1 of Test1 class
        // Creating a new Test2 object and passing the current Test1 object as an argument to its constructor
        Test2 t2 = new Test2(this);
        System.out.println("Inside m1 method of Test1 class");
    }
}
