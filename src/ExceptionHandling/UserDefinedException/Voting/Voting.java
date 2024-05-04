package ExceptionHandling.UserDefinedException.Voting;

import java.util.Scanner;

public class Voting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :: ");
        int age = sc.nextInt();

        if(age<18)
        {
            try
            {
//                          throw new InvalidException();
                throw new InvalidException("You can not vote as your age is below 18 ::  "+age);
            }
            catch (InvalidException e)
            {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Happy Voting !!!!! ");
            }

        }
        else
        {
            System.out.println("You can vote");
        }
        System.out.println("--------- Thank you --------");
    }
}
