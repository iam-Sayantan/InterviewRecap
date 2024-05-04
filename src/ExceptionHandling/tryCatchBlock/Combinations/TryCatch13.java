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
        /*

        This is possible only since exception class is before Throwable class.
        Exception class is the child class of the Throwable class. So
        this means we always need to put child classes before parent classes in case of
        multiple exceptions in catch blocks

         */

        // This catch block catches exceptions of type Exception and its subclasses.
        // Since Exception is a child class of Throwable, it must come before the catch block for Throwable.
        catch (Exception e)
        {
            System.out.println("3");
        }
        // This catch block catches exceptions of type Throwable and its subclasses.
       // However, it won't catch exceptions that have already been caught by a preceding catch block for a more specific subclass of Throwable.
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
