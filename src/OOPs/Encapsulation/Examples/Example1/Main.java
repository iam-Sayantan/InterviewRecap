package OOPs.Encapsulation.Examples.Example1;

public class Main
{
    public static void main(String[] args)
    {
        Account account = new Account();
        account.setAccNo("120XXXX");
        account.setAmount(100);

        BankFunctions bankFunctions = new BankFunctions();
        bankFunctions.deposit(account, 500);
        bankFunctions.withdraw(account,50);

        System.out.println("Account No :: "+account.getAccNo()+" && Amount :: "+account.getAmount());
    }
}
