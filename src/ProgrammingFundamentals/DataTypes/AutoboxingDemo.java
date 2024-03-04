package ProgrammingFundamentals.DataTypes;

public class AutoboxingDemo
{
    public static void main(String[] args) {
        int a = 10; // Primitive data type
        Integer i = new Integer(a); // Explicitly converting - Constructs a newly allocated Integer object i that represents the specified int value (a=10)
        Integer d = a; // Autoboxing - Converting Primitive into object of Wrapper class d. (Integer d = Integer.valueOf(a))
        System.out.println("Value of a: "+a);
        System.out.println("Value of i where we are converting explicitly : "+i);
        System.out.println("Value of d where autoboxing is done : "+d);
    }



}