package ExceptionHandling.tryCatchBlock.Combinations;

public class TryCatch6
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
//        catch (ArrayIndexOutOfBoundsException e) // Will give error since the parent class of this exception has already caught it before hand.
        /*

         catch (ArithmeticException e)
        {
            System.out.println("3");
        }

         */
        {
            System.out.println("3.1");
        }
        System.out.println("4");
    }
}
