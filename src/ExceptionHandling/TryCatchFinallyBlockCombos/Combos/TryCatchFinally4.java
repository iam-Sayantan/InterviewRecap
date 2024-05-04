package ExceptionHandling.TryCatchFinallyBlockCombos.Combos;

public class TryCatchFinally4
{
    public static void main(String[] args)
    {
        System.out.println("1");
        try
        {
            System.out.println(100/0);
            System.out.println("2");
        }
        /*
        We have to put catch block after try block.
        Cannot put anything else there.

        This is an error since we made syntax error.
         */
//        System.out.println("Hello");
        catch (Exception e)
        {
            System.out.println("3");
        }
        finally
        {
            System.out.println("4");
        }
        System.out.println("5");
    }
}
