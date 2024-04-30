package ExceptionHandling.tryCatchBlock;

public class TryCatchDemo3
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(100/0);
        }
        catch (Exception e)
        {
            System.out.println("Exception = " +e);
            System.out.println("Exception Message = "+e.getMessage());
            System.out.println("======== Stack Trace ===============");
            e.printStackTrace();

        }
        System.out.println("Thanks");
    }
}
