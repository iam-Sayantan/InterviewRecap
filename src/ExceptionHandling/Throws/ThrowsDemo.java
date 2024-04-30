package ExceptionHandling.Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo
{
    public static void main(String[] args) throws FileNotFoundException, ArrayIndexOutOfBoundsException, ArithmeticException
    {
        FileInputStream fis = new FileInputStream("");
    }
}
