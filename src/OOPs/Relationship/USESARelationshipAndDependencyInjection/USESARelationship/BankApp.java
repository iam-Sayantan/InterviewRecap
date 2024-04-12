package OOPs.Relationship.USESARelationshipAndDependencyInjection.USESARelationship;

public class BankApp
{
    public static void main(String[] args)
    {
        Account ob1 = new Account("123","Sayantan",80000);
        Transaction ob2 = new Transaction();
        ob2.deposit(ob1,30000);
    }
}
