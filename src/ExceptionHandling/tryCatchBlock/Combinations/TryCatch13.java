package ExceptionHandling.tryCatchBlock.Combinations;

public class TryCatch13
{
    public static void main(String[] args)
    {
        System.out.println("1");
        try
        {
            System.out.println("2");
            System.out.println(100/0);
        }
        catch (Exception e)
        {
            System.out.println("3");
        }
        catch (Throwable e)
        {
            System.out.println("4");
        }
        /*

        catch (Throwable e)
        {
            System.out.println("3");
        }
        catch (Exception e)
        {
            System.out.println("4");
        }

        This is not possible since exception is already caught. Throwable is the parent class
        of the Exception class. Throwable has already caught the exception and Exception cannot
        catch it.

         */
        System.out.println("5");
    }
}
