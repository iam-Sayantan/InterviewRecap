package OOPs.Relationship.USESARelationshipAndDependencyInjection.USESARelationship;

public class Transaction
{
    public void deposit(Account acc, int amount)
    {
        int totalBalance = acc.balance + amount;
        System.out.println("Amount deposited successfully !!!! ");
        System.out.println("========== TRANSACTION DETAILS ===========");
        System.out.println("Name : "+acc.name);
        System.out.println("Account Number : "+acc.accNo);
        System.out.println("Total Balance : "+totalBalance);
    }
}
