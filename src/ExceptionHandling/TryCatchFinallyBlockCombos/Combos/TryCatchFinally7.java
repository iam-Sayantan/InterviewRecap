package ExceptionHandling.TryCatchFinallyBlockCombos.Combos;

public class TryCatchFinally7
{
    public static void main(String[] args)
    {
        System.out.println("1");
        try
        {
            System.out.println(100/0);
            System.out.println("2");
        }
        catch (Exception e)
        {
            System.out.println("3");
        }
        finally {
            System.out.println("4");
        }
        try
        {
            System.out.println("5");
        }
        catch (Throwable e)
        {
            System.out.println("6");
        }
        System.out.println("7");
        /*
        We cannot have more than one finally block in a java code
        But we can have nested try-catch-finally blocks within another
        finally block, which would effectively give you multiple
        finally blocks within the same scope,
        but they are part of different try blocks

        finally
        {
            System.out.println("8");
        }
         */
    }
}
