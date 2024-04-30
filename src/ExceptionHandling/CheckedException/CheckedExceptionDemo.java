package ExceptionHandling.CheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("");
            int i = fileInputStream.read();
            System.out.println(i);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}
