package ExceptionHandling.Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo
{
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream("");
            fis.read();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            try {
                fis.close();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
