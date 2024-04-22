package OOPs.thisKeyword.Examples.Example7;

class Test2 {
    // Constructor of Test2 class taking a Test1 object as an argument
    Test2(Test1 t1) {
        // Inside constructor of Test2 class
        System.out.println(t1); // Prints the reference of the Test1 object passed as argument
        System.out.println("In Test2 Constructor");
    }
}