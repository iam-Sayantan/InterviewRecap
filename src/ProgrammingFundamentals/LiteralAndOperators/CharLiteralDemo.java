package ProgrammingFundamentals.LiteralAndOperators;

public class CharLiteralDemo
{
    public static void main(String[] args) {
                char c1 = 'x'; // Single quote character
        char c2 = 100; //Character as integer literal // Every number (0 to 65535) has an ASCII value
//        char c3 = -100; // It will form an error.
        char c4 = '\u0061'; //Unicode representation can be a hexadecimal number
        char c5 = '\n'; // Escape Characters

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c4);
        System.out.println(c5);
    }
}
