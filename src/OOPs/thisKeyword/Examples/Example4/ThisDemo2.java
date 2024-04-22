package OOPs.thisKeyword.Examples.Example4;

public class ThisDemo2 {

        ThisDemo2()
        {
            this(10);
            System.out.println("1");
        }
        ThisDemo2(int no)
        {
            // this(); // Using "this" keyword to invoke the default constructor: This comment accurately explains the usage of the this keyword to invoke the default constructor within the parameterized constructor.
            System.out.println("2");
        }
        public static void main(String[] args)
        {
            ThisDemo2 obj1 = new ThisDemo2();
            // ThisDemo obj2 = new ThisDemo(10);
        }
    }
