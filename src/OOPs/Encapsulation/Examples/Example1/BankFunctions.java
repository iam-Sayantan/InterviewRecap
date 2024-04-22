package OOPs.Encapsulation.Examples.Example1;

public class BankFunctions
{
    void deposit(Account acc, int depositAmount)
    {
        int total = acc.getAmount() + depositAmount;
        acc.setAmount(total);
    }

    void withdraw(Account acc, int withdrawAmount)
    {
        int total = acc.getAmount()-withdrawAmount;
        acc.setAmount(total);
    }


}
