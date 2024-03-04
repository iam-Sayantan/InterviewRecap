package ProgrammingFundamentals.DataTypes;

public class UnboxingDemo
{
    public static void main(String[] args) {
        Integer j = new Integer(20);
        int b = j.intValue(); // Converting integer into int explicitly.
        int c = j; // Unboxing - now compiler will write a.intValue() internally
        System.out.println("Value of j where J is Integer: "+j);
        System.out.println("Value of b after converting wrapper type into corresponding primitive type EXPLICITLY: "+b);
        System.out.println("Value of c after unboxing is done : "+c);
    }
}
