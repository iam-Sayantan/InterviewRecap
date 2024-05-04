package ExceptionHandling.TryCatchFinallyBlockCombos.Combos;

public class TryCatchFinally5
{
    public static void main(String[] args)
    {
        System.out.println("1");
        try
        {
            System.out.println(100/0);
            System.out.println("2");
        }
        finally
        {
            System.out.println("4");
        }
        System.out.println("5");
    }
}

/*
This means exception will be caught but the program
will abnormally terminate after
finally block execution without printing 5 in line number 17
 */