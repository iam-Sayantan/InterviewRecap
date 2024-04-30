package ExceptionHandling.Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test
{
    public static void main(String[] args) throws FileNotFoundException {
        Test obj = new Test();
        obj.m1();
    }
    void m1() throws FileNotFoundException {
        m2();
    }
    void m2() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("");
    }
}
