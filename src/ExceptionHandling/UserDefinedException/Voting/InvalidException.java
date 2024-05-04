package ExceptionHandling.UserDefinedException.Voting;

public class InvalidException extends RuntimeException
{
    public InvalidException()
    {
        super();
    }

    public InvalidException(String message)
    {
           super(message);
    }
}
