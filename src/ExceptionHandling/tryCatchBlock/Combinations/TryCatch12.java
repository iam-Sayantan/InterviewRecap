package ExceptionHandling.tryCatchBlock.Combinations;

public class TryCatch12
{
    public static void main(String[] args)
    {
        System.out.println("1");
        try
        {
            System.out.println("2");
            System.out.println(100/0);
        }
//        catch (Object e)
                /*
                        When an exception is thrown, an object of the Throwable class is
                        created containing Exception Class Name, Message or Description
                        and StackTrace. But here, we are providing Object instead of any exception
                        or parent class of exception which is Throwable.
                        So the object of the object class which will be created over here, that
                        won't create any of the 3 contents mentioned above.
                 */
        // For running purposes, I am providing Exception class in catch block
        catch (Exception e)
        {
            System.out.println("3");
        }
        System.out.println("4");
    }
}
