package ExceptionHandling.Throw;

public class ThrowDemo
{
    int age = 10;
    void checkAge()
    {
        if(age>18)
        {
            vote();
        }
        else
        {
            throw new RuntimeException("YOU CANNOT VOTE");
        }
    }
    void vote()
    {
        System.out.println("You cannot vote");;
    }
    public static void main(String[] args)
    {
        ThrowDemo obj = new ThrowDemo();
        obj.checkAge();
    }
}
